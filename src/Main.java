public class Main {

        public static void main(String[] args) {
            ContactManager myContactsManager = new ContactManager();

            // Ajouter des contacts

            myContactsManager.addContact(new Contact("AICHA", "076873923"));
            myContactsManager.addContact(new Contact("LEILA", "0748238039"));

            // Rechercher un contact
            String phoneNumber = myContactsManager.searchContact("LEILA");
            System.out.println("Le numéro de téléphone de LEILA est : " + phoneNumber);
        }
    }


