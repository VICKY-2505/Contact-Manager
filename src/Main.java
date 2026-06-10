public class Main {

        public static void main(String[] args) {
            ContactManager myContactsManager = new ContactManager();

            // Ajouter des contacts

            myContactsManager.addContact(new Contact("EBLIN", "076873923"));
            myContactsManager.addContact(new Contact("JOSEPH", "0748238039"));

            // Rechercher un contact
            String phoneNumber = myContactsManager.searchContact("EBLIN");
            if (phoneNumber != null) {
            System.out.println("Le numéro de téléphone de EBLIN est : " + phoneNumber);
            } else {
                System.out.println("Contact non trouvé.");
            }
        }
    }


