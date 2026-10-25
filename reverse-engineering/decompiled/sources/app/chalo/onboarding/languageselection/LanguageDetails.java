package app.chalo.onboarding.languageselection;

import defpackage.vo1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/onboarding/languageselection/LanguageDetails;", "", "onboarding_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class LanguageDetails {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6643a;
    public final String b;

    public LanguageDetails(String languageName, String locale) {
        Intrinsics.i(languageName, "languageName");
        Intrinsics.i(locale, "locale");
        this.f6643a = languageName;
        this.b = locale;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LanguageDetails)) {
            return false;
        }
        LanguageDetails languageDetails = (LanguageDetails) obj;
        return Intrinsics.d(this.f6643a, languageDetails.f6643a) && Intrinsics.d(this.b, languageDetails.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f6643a.hashCode() * 31);
    }

    public final String toString() {
        return vo1.o("LanguageDetails(languageName=", this.f6643a, ", locale=", this.b, ")");
    }
}
