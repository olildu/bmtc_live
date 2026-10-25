package app.chalo.login.ui.options;

import app.chalo.config.ChaloPhoneNumberCountry;
import app.chalo.constants.Source;
import app.chalo.login.truecaller.TruecallerError;
import defpackage.cb0;
import defpackage.dd;
import defpackage.gf;
import defpackage.nf1;
import defpackage.vo1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\f\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u0082\u0001\f\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019¨\u0006\u001a"}, d2 = {"Lapp/chalo/login/ui/options/LoginOptionsIntent;", "", "InitializationIntent", "ShowTruecallerOptionIfPossible", "OnPhoneNumberEntered", "OnContinueClicked", "OnOtherLoginOptionsClicked", "OnTruecallerSuccessCallback", "OnTruecallerErrorCallback", "SetUpTruecallerVisibilityIntent", "LoginBackPressed", "OnCountrySelectDropdownClicked", "OnCountrySelected", "PhoneNumberFieldFocusChangeIntent", "Lapp/chalo/login/ui/options/LoginOptionsIntent$InitializationIntent;", "Lapp/chalo/login/ui/options/LoginOptionsIntent$LoginBackPressed;", "Lapp/chalo/login/ui/options/LoginOptionsIntent$OnContinueClicked;", "Lapp/chalo/login/ui/options/LoginOptionsIntent$OnCountrySelectDropdownClicked;", "Lapp/chalo/login/ui/options/LoginOptionsIntent$OnCountrySelected;", "Lapp/chalo/login/ui/options/LoginOptionsIntent$OnOtherLoginOptionsClicked;", "Lapp/chalo/login/ui/options/LoginOptionsIntent$OnPhoneNumberEntered;", "Lapp/chalo/login/ui/options/LoginOptionsIntent$OnTruecallerErrorCallback;", "Lapp/chalo/login/ui/options/LoginOptionsIntent$OnTruecallerSuccessCallback;", "Lapp/chalo/login/ui/options/LoginOptionsIntent$PhoneNumberFieldFocusChangeIntent;", "Lapp/chalo/login/ui/options/LoginOptionsIntent$SetUpTruecallerVisibilityIntent;", "Lapp/chalo/login/ui/options/LoginOptionsIntent$ShowTruecallerOptionIfPossible;", "login_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class LoginOptionsIntent {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/login/ui/options/LoginOptionsIntent$InitializationIntent;", "Lapp/chalo/login/ui/options/LoginOptionsIntent;", "login_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class InitializationIntent extends LoginOptionsIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Source f5305a;

        public InitializationIntent(Source source) {
            Intrinsics.i(source, "source");
            this.f5305a = source;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof InitializationIntent) && this.f5305a == ((InitializationIntent) obj).f5305a;
        }

        public final int hashCode() {
            return this.f5305a.hashCode();
        }

        public final String toString() {
            return gf.f(this.f5305a, "InitializationIntent(source=", ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/login/ui/options/LoginOptionsIntent$LoginBackPressed;", "Lapp/chalo/login/ui/options/LoginOptionsIntent;", "login_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class LoginBackPressed extends LoginOptionsIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final LoginBackPressed f5306a = new LoginBackPressed();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/login/ui/options/LoginOptionsIntent$OnContinueClicked;", "Lapp/chalo/login/ui/options/LoginOptionsIntent;", "login_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class OnContinueClicked extends LoginOptionsIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final OnContinueClicked f5307a = new OnContinueClicked();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/login/ui/options/LoginOptionsIntent$OnCountrySelectDropdownClicked;", "Lapp/chalo/login/ui/options/LoginOptionsIntent;", "login_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class OnCountrySelectDropdownClicked extends LoginOptionsIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final OnCountrySelectDropdownClicked f5308a = new OnCountrySelectDropdownClicked();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/login/ui/options/LoginOptionsIntent$OnCountrySelected;", "Lapp/chalo/login/ui/options/LoginOptionsIntent;", "login_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class OnCountrySelected extends LoginOptionsIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ChaloPhoneNumberCountry f5309a;

        public OnCountrySelected(ChaloPhoneNumberCountry country) {
            Intrinsics.i(country, "country");
            this.f5309a = country;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnCountrySelected) && this.f5309a == ((OnCountrySelected) obj).f5309a;
        }

        public final int hashCode() {
            return this.f5309a.hashCode();
        }

        public final String toString() {
            return "OnCountrySelected(country=" + this.f5309a + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/login/ui/options/LoginOptionsIntent$OnOtherLoginOptionsClicked;", "Lapp/chalo/login/ui/options/LoginOptionsIntent;", "login_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class OnOtherLoginOptionsClicked extends LoginOptionsIntent {
        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof OnOtherLoginOptionsClicked);
        }

        public final int hashCode() {
            throw null;
        }

        public final String toString() {
            return "OnOtherLoginOptionsClicked(optionType=null)";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/login/ui/options/LoginOptionsIntent$OnPhoneNumberEntered;", "Lapp/chalo/login/ui/options/LoginOptionsIntent;", "login_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class OnPhoneNumberEntered extends LoginOptionsIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f5310a;

        public OnPhoneNumberEntered(String enteredString) {
            Intrinsics.i(enteredString, "enteredString");
            this.f5310a = enteredString;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnPhoneNumberEntered) && Intrinsics.d(this.f5310a, ((OnPhoneNumberEntered) obj).f5310a);
        }

        public final int hashCode() {
            return this.f5310a.hashCode();
        }

        public final String toString() {
            return vo1.B("OnPhoneNumberEntered(enteredString=", this.f5310a, ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/login/ui/options/LoginOptionsIntent$OnTruecallerErrorCallback;", "Lapp/chalo/login/ui/options/LoginOptionsIntent;", "login_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class OnTruecallerErrorCallback extends LoginOptionsIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TruecallerError f5311a;

        public OnTruecallerErrorCallback(TruecallerError errorType) {
            Intrinsics.i(errorType, "errorType");
            this.f5311a = errorType;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnTruecallerErrorCallback) && this.f5311a == ((OnTruecallerErrorCallback) obj).f5311a;
        }

        public final int hashCode() {
            return this.f5311a.hashCode();
        }

        public final String toString() {
            return "OnTruecallerErrorCallback(errorType=" + this.f5311a + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/login/ui/options/LoginOptionsIntent$OnTruecallerSuccessCallback;", "Lapp/chalo/login/ui/options/LoginOptionsIntent;", "login_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class OnTruecallerSuccessCallback extends LoginOptionsIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f5312a;
        public final String b;
        public final String c;
        public final String d;
        public final String e;
        public final String f;
        public final String g;

        public OnTruecallerSuccessCallback(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
            this.f5312a = str;
            this.b = str2;
            this.c = str3;
            this.d = str4;
            this.e = str5;
            this.f = str6;
            this.g = str7;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnTruecallerSuccessCallback)) {
                return false;
            }
            OnTruecallerSuccessCallback onTruecallerSuccessCallback = (OnTruecallerSuccessCallback) obj;
            return Intrinsics.d(this.f5312a, onTruecallerSuccessCallback.f5312a) && Intrinsics.d(this.b, onTruecallerSuccessCallback.b) && Intrinsics.d(this.c, onTruecallerSuccessCallback.c) && Intrinsics.d(this.d, onTruecallerSuccessCallback.d) && Intrinsics.d(this.e, onTruecallerSuccessCallback.e) && Intrinsics.d(this.f, onTruecallerSuccessCallback.f) && Intrinsics.d(this.g, onTruecallerSuccessCallback.g);
        }

        public final int hashCode() {
            return this.g.hashCode() + nf1.e(nf1.e(nf1.e(nf1.e(nf1.e(this.f5312a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f);
        }

        public final String toString() {
            StringBuilder sbE = dd.e("OnTruecallerSuccessCallback(payload=", this.f5312a, ", signature=", this.b, ", numberWithPrefixedCountryCode=");
            cb0.t(sbE, this.c, ", signatureAlgorithm=", this.d, ", firstName=");
            cb0.t(sbE, this.e, ", lastName=", this.f, ", emailId=");
            return vo1.p(sbE, this.g, ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/login/ui/options/LoginOptionsIntent$PhoneNumberFieldFocusChangeIntent;", "Lapp/chalo/login/ui/options/LoginOptionsIntent;", "login_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class PhoneNumberFieldFocusChangeIntent extends LoginOptionsIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f5313a;

        public PhoneNumberFieldFocusChangeIntent(boolean z) {
            this.f5313a = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof PhoneNumberFieldFocusChangeIntent) && this.f5313a == ((PhoneNumberFieldFocusChangeIntent) obj).f5313a;
        }

        public final int hashCode() {
            return this.f5313a ? 1231 : 1237;
        }

        public final String toString() {
            return cb0.k("PhoneNumberFieldFocusChangeIntent(hasFocus=", ")", this.f5313a);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/login/ui/options/LoginOptionsIntent$SetUpTruecallerVisibilityIntent;", "Lapp/chalo/login/ui/options/LoginOptionsIntent;", "login_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SetUpTruecallerVisibilityIntent extends LoginOptionsIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f5314a;

        public SetUpTruecallerVisibilityIntent(boolean z) {
            this.f5314a = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SetUpTruecallerVisibilityIntent) && this.f5314a == ((SetUpTruecallerVisibilityIntent) obj).f5314a;
        }

        public final int hashCode() {
            return this.f5314a ? 1231 : 1237;
        }

        public final String toString() {
            return cb0.k("SetUpTruecallerVisibilityIntent(isTruecallerUsable=", ")", this.f5314a);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/login/ui/options/LoginOptionsIntent$ShowTruecallerOptionIfPossible;", "Lapp/chalo/login/ui/options/LoginOptionsIntent;", "login_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ShowTruecallerOptionIfPossible extends LoginOptionsIntent {
    }
}
