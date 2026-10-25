package app.chalo.userprofile.ui.minprofileupdate;

import app.chalo.userprofile.Gender;
import app.chalo.userprofile.domain.validation.ProfileInputValidationError;
import defpackage.b3;
import defpackage.cb0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lapp/chalo/userprofile/ui/minprofileupdate/MinProfileInputState;", "", "ProfilePhotoInput", "GenderInput", "AgeInput", "NameAndDobInput", "Lapp/chalo/userprofile/ui/minprofileupdate/MinProfileInputState$AgeInput;", "Lapp/chalo/userprofile/ui/minprofileupdate/MinProfileInputState$GenderInput;", "Lapp/chalo/userprofile/ui/minprofileupdate/MinProfileInputState$NameAndDobInput;", "Lapp/chalo/userprofile/ui/minprofileupdate/MinProfileInputState$ProfilePhotoInput;", "login_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class MinProfileInputState {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/userprofile/ui/minprofileupdate/MinProfileInputState$AgeInput;", "Lapp/chalo/userprofile/ui/minprofileupdate/MinProfileInputState;", "login_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class AgeInput extends MinProfileInputState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f10382a;
        public final ProfileInputValidationError.Age b;
        public final boolean c;

        public AgeInput(String ageText, ProfileInputValidationError.Age age, boolean z) {
            Intrinsics.i(ageText, "ageText");
            this.f10382a = ageText;
            this.b = age;
            this.c = z;
        }

        public static AgeInput b(AgeInput ageInput, boolean z) {
            String ageText = ageInput.f10382a;
            ProfileInputValidationError.Age age = ageInput.b;
            Intrinsics.i(ageText, "ageText");
            return new AgeInput(ageText, age, z);
        }

        @Override // app.chalo.userprofile.ui.minprofileupdate.MinProfileInputState
        /* JADX INFO: renamed from: a, reason: from getter */
        public final boolean getF10385a() {
            return this.c;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AgeInput)) {
                return false;
            }
            AgeInput ageInput = (AgeInput) obj;
            return Intrinsics.d(this.f10382a, ageInput.f10382a) && Intrinsics.d(this.b, ageInput.b) && this.c == ageInput.c;
        }

        public final int hashCode() {
            int iHashCode = this.f10382a.hashCode() * 31;
            ProfileInputValidationError.Age age = this.b;
            return ((iHashCode + (age == null ? 0 : age.hashCode())) * 31) + (this.c ? 1231 : 1237);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("AgeInput(ageText=");
            sb.append(this.f10382a);
            sb.append(", validationError=");
            sb.append(this.b);
            sb.append(", isSkipped=");
            return b3.g(")", sb, this.c);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/userprofile/ui/minprofileupdate/MinProfileInputState$NameAndDobInput;", "Lapp/chalo/userprofile/ui/minprofileupdate/MinProfileInputState;", "login_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class NameAndDobInput extends MinProfileInputState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f10384a;
        public final Long b;
        public final ProfileInputValidationError.Age c;
        public final boolean d;

        public NameAndDobInput(String nameText, Long l, ProfileInputValidationError.Age age, boolean z) {
            Intrinsics.i(nameText, "nameText");
            this.f10384a = nameText;
            this.b = l;
            this.c = age;
            this.d = z;
        }

        public static NameAndDobInput b(NameAndDobInput nameAndDobInput, String nameText, Long l, ProfileInputValidationError.Age.Empty empty, boolean z, int i) {
            if ((i & 1) != 0) {
                nameText = nameAndDobInput.f10384a;
            }
            if ((i & 2) != 0) {
                l = nameAndDobInput.b;
            }
            ProfileInputValidationError.Age age = empty;
            if ((i & 4) != 0) {
                age = nameAndDobInput.c;
            }
            Intrinsics.i(nameText, "nameText");
            return new NameAndDobInput(nameText, l, age, z);
        }

        @Override // app.chalo.userprofile.ui.minprofileupdate.MinProfileInputState
        /* JADX INFO: renamed from: a, reason: from getter */
        public final boolean getF10385a() {
            return this.d;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof NameAndDobInput)) {
                return false;
            }
            NameAndDobInput nameAndDobInput = (NameAndDobInput) obj;
            return Intrinsics.d(this.f10384a, nameAndDobInput.f10384a) && Intrinsics.d(this.b, nameAndDobInput.b) && Intrinsics.d(this.c, nameAndDobInput.c) && this.d == nameAndDobInput.d;
        }

        public final int hashCode() {
            int iHashCode = this.f10384a.hashCode() * 31;
            Long l = this.b;
            int iHashCode2 = (iHashCode + (l == null ? 0 : l.hashCode())) * 31;
            ProfileInputValidationError.Age age = this.c;
            return ((iHashCode2 + (age != null ? age.hashCode() : 0)) * 31) + (this.d ? 1231 : 1237);
        }

        public final String toString() {
            return "NameAndDobInput(nameText=" + this.f10384a + ", dobInMillis=" + this.b + ", validationError=" + this.c + ", isSkipped=" + this.d + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/userprofile/ui/minprofileupdate/MinProfileInputState$ProfilePhotoInput;", "Lapp/chalo/userprofile/ui/minprofileupdate/MinProfileInputState;", "login_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ProfilePhotoInput extends MinProfileInputState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f10385a;

        public ProfilePhotoInput(boolean z) {
            this.f10385a = z;
        }

        @Override // app.chalo.userprofile.ui.minprofileupdate.MinProfileInputState
        /* JADX INFO: renamed from: a, reason: from getter */
        public final boolean getF10385a() {
            return this.f10385a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ProfilePhotoInput) && this.f10385a == ((ProfilePhotoInput) obj).f10385a;
        }

        public final int hashCode() {
            return this.f10385a ? 1231 : 1237;
        }

        public final String toString() {
            return cb0.k("ProfilePhotoInput(isSkipped=", ")", this.f10385a);
        }
    }

    /* JADX INFO: renamed from: a */
    public abstract boolean getF10385a();

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/userprofile/ui/minprofileupdate/MinProfileInputState$GenderInput;", "Lapp/chalo/userprofile/ui/minprofileupdate/MinProfileInputState;", "login_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class GenderInput extends MinProfileInputState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Gender f10383a;
        public final boolean b;

        public GenderInput(Gender selectedGender, boolean z) {
            Intrinsics.i(selectedGender, "selectedGender");
            this.f10383a = selectedGender;
            this.b = z;
        }

        @Override // app.chalo.userprofile.ui.minprofileupdate.MinProfileInputState
        /* JADX INFO: renamed from: a, reason: from getter */
        public final boolean getF10385a() {
            return this.b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof GenderInput)) {
                return false;
            }
            GenderInput genderInput = (GenderInput) obj;
            return this.f10383a == genderInput.f10383a && this.b == genderInput.b;
        }

        public final int hashCode() {
            return (this.f10383a.hashCode() * 31) + (this.b ? 1231 : 1237);
        }

        public final String toString() {
            return "GenderInput(selectedGender=" + this.f10383a + ", isSkipped=" + this.b + ")";
        }

        public /* synthetic */ GenderInput(Gender gender, int i) {
            this((i & 1) != 0 ? Gender.NULL : gender, false);
        }
    }
}
