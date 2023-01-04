package com.example.couchbasesample;
import org.springframework.data.annotation.Id;
import org.springframework.data.couchbase.core.mapping.Document;

    @Document
    public class UserEntity {

        @Id
        private String id;
        private String firstName;
        private String lastName;
        private String email;
        private String tagLine;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getFirstName() {
            return firstName;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getTagLine() {
            return tagLine;
        }

        public void setTagLine(String tagLine) {
            this.tagLine = tagLine;
        }
    }

