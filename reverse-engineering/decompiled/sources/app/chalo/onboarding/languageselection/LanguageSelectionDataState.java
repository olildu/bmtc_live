package app.chalo.onboarding.languageselection;

import app.chalo.features.language.data.LanguageSelectionSourceType;
import defpackage.r30;
import defpackage.z40;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/onboarding/languageselection/LanguageSelectionDataState;", "", "onboarding_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class LanguageSelectionDataState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f6650a;
    public final LanguageSelectionSnackbarType b;
    public final boolean c;
    public final boolean d;
    public final LanguageSelectionSourceType e;
    public final List f;
    public final LanguageDetails g;
    public final String h;

    public LanguageSelectionDataState(boolean z, LanguageSelectionSnackbarType snackBarType, boolean z2, boolean z3, LanguageSelectionSourceType sourceType, List localeList, LanguageDetails languageDetails, String str) {
        Intrinsics.i(snackBarType, "snackBarType");
        Intrinsics.i(sourceType, "sourceType");
        Intrinsics.i(localeList, "localeList");
        this.f6650a = z;
        this.b = snackBarType;
        this.c = z2;
        this.d = z3;
        this.e = sourceType;
        this.f = localeList;
        this.g = languageDetails;
        this.h = str;
    }

    public static LanguageSelectionDataState a(LanguageSelectionDataState languageSelectionDataState, boolean z, LanguageSelectionSnackbarType languageSelectionSnackbarType, boolean z2, boolean z3, LanguageSelectionSourceType languageSelectionSourceType, List list, LanguageDetails languageDetails, String str, int i) {
        if ((i & 1) != 0) {
            z = languageSelectionDataState.f6650a;
        }
        boolean z4 = z;
        if ((i & 2) != 0) {
            languageSelectionSnackbarType = languageSelectionDataState.b;
        }
        LanguageSelectionSnackbarType snackBarType = languageSelectionSnackbarType;
        if ((i & 4) != 0) {
            z2 = languageSelectionDataState.c;
        }
        boolean z5 = z2;
        if ((i & 8) != 0) {
            z3 = languageSelectionDataState.d;
        }
        boolean z6 = z3;
        if ((i & 16) != 0) {
            languageSelectionSourceType = languageSelectionDataState.e;
        }
        LanguageSelectionSourceType sourceType = languageSelectionSourceType;
        if ((i & 32) != 0) {
            list = languageSelectionDataState.f;
        }
        List localeList = list;
        LanguageDetails languageDetails2 = (i & 64) != 0 ? languageSelectionDataState.g : languageDetails;
        String appTncLink = (i & 128) != 0 ? languageSelectionDataState.h : str;
        languageSelectionDataState.getClass();
        Intrinsics.i(snackBarType, "snackBarType");
        Intrinsics.i(sourceType, "sourceType");
        Intrinsics.i(localeList, "localeList");
        Intrinsics.i(appTncLink, "appTncLink");
        return new LanguageSelectionDataState(z4, snackBarType, z5, z6, sourceType, localeList, languageDetails2, appTncLink);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LanguageSelectionDataState)) {
            return false;
        }
        LanguageSelectionDataState languageSelectionDataState = (LanguageSelectionDataState) obj;
        return this.f6650a == languageSelectionDataState.f6650a && Intrinsics.d(this.b, languageSelectionDataState.b) && this.c == languageSelectionDataState.c && this.d == languageSelectionDataState.d && this.e == languageSelectionDataState.e && Intrinsics.d(this.f, languageSelectionDataState.f) && Intrinsics.d(this.g, languageSelectionDataState.g) && Intrinsics.d(this.h, languageSelectionDataState.h);
    }

    public final int hashCode() {
        return this.h.hashCode() + ((this.g.hashCode() + r30.b((this.e.hashCode() + ((((((this.b.hashCode() + ((this.f6650a ? 1231 : 1237) * 31)) * 31) + (this.c ? 1231 : 1237)) * 31) + (this.d ? 1231 : 1237)) * 31)) * 31, 31, this.f)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LanguageSelectionDataState(showLoadingDialogue=");
        sb.append(this.f6650a);
        sb.append(", snackBarType=");
        sb.append(this.b);
        sb.append(", showTncText=");
        z40.r(sb, this.c, ", showToolbar=", this.d, ", sourceType=");
        sb.append(this.e);
        sb.append(", localeList=");
        sb.append(this.f);
        sb.append(", currentLanguageSelected=");
        sb.append(this.g);
        sb.append(", appTncLink=");
        sb.append(this.h);
        sb.append(")");
        return sb.toString();
    }
}
