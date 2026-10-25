package app.chalo.userprofile.domain.validation;

import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/userprofile/domain/validation/ProfileInputValidationError;", "", "Age", "Email", "Lapp/chalo/userprofile/domain/validation/ProfileInputValidationError$Age;", "Lapp/chalo/userprofile/domain/validation/ProfileInputValidationError$Email;", "login_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface ProfileInputValidationError {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lapp/chalo/userprofile/domain/validation/ProfileInputValidationError$Age;", "Lapp/chalo/userprofile/domain/validation/ProfileInputValidationError;", "Empty", "NonNumeric", "OutOfRange", "Lapp/chalo/userprofile/domain/validation/ProfileInputValidationError$Age$Empty;", "Lapp/chalo/userprofile/domain/validation/ProfileInputValidationError$Age$NonNumeric;", "Lapp/chalo/userprofile/domain/validation/ProfileInputValidationError$Age$OutOfRange;", "login_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface Age extends ProfileInputValidationError {

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/userprofile/domain/validation/ProfileInputValidationError$Age$Empty;", "Lapp/chalo/userprofile/domain/validation/ProfileInputValidationError$Age;", "login_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Empty implements Age {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final Empty f10328a = new Empty();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof Empty);
            }

            public final int hashCode() {
                return -280721049;
            }

            public final String toString() {
                return "Empty";
            }
        }

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/userprofile/domain/validation/ProfileInputValidationError$Age$NonNumeric;", "Lapp/chalo/userprofile/domain/validation/ProfileInputValidationError$Age;", "login_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class NonNumeric implements Age {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final NonNumeric f10329a = new NonNumeric();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof NonNumeric);
            }

            public final int hashCode() {
                return -2022231130;
            }

            public final String toString() {
                return "NonNumeric";
            }
        }

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/userprofile/domain/validation/ProfileInputValidationError$Age$OutOfRange;", "Lapp/chalo/userprofile/domain/validation/ProfileInputValidationError$Age;", "login_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class OutOfRange implements Age {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final OutOfRange f10330a = new OutOfRange();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof OutOfRange);
            }

            public final int hashCode() {
                return 2121366174;
            }

            public final String toString() {
                return "OutOfRange";
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/userprofile/domain/validation/ProfileInputValidationError$Email;", "Lapp/chalo/userprofile/domain/validation/ProfileInputValidationError;", "Empty", "InvalidFormat", "Lapp/chalo/userprofile/domain/validation/ProfileInputValidationError$Email$Empty;", "Lapp/chalo/userprofile/domain/validation/ProfileInputValidationError$Email$InvalidFormat;", "login_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface Email extends ProfileInputValidationError {

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/userprofile/domain/validation/ProfileInputValidationError$Email$Empty;", "Lapp/chalo/userprofile/domain/validation/ProfileInputValidationError$Email;", "login_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Empty implements Email {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final Empty f10331a = new Empty();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof Empty);
            }

            public final int hashCode() {
                return 2123848708;
            }

            public final String toString() {
                return "Empty";
            }
        }

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/userprofile/domain/validation/ProfileInputValidationError$Email$InvalidFormat;", "Lapp/chalo/userprofile/domain/validation/ProfileInputValidationError$Email;", "login_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class InvalidFormat implements Email {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final InvalidFormat f10332a = new InvalidFormat();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof InvalidFormat);
            }

            public final int hashCode() {
                return 969502853;
            }

            public final String toString() {
                return "InvalidFormat";
            }
        }
    }
}
