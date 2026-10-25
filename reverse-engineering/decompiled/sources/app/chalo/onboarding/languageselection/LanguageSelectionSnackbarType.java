package app.chalo.onboarding.languageselection;

import defpackage.vo1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lapp/chalo/onboarding/languageselection/LanguageSelectionSnackbarType;", "", "None", "LanguageDownloadFailed", "ChaloConfigFetchFailed", "HomeScreenConfigFetchFailed", "Lapp/chalo/onboarding/languageselection/LanguageSelectionSnackbarType$ChaloConfigFetchFailed;", "Lapp/chalo/onboarding/languageselection/LanguageSelectionSnackbarType$HomeScreenConfigFetchFailed;", "Lapp/chalo/onboarding/languageselection/LanguageSelectionSnackbarType$LanguageDownloadFailed;", "Lapp/chalo/onboarding/languageselection/LanguageSelectionSnackbarType$None;", "onboarding_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class LanguageSelectionSnackbarType {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/onboarding/languageselection/LanguageSelectionSnackbarType$ChaloConfigFetchFailed;", "Lapp/chalo/onboarding/languageselection/LanguageSelectionSnackbarType;", "onboarding_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ChaloConfigFetchFailed extends LanguageSelectionSnackbarType {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f6658a;

        public ChaloConfigFetchFailed(String msg) {
            Intrinsics.i(msg, "msg");
            this.f6658a = msg;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ChaloConfigFetchFailed) && Intrinsics.d(this.f6658a, ((ChaloConfigFetchFailed) obj).f6658a);
        }

        public final int hashCode() {
            return this.f6658a.hashCode();
        }

        public final String toString() {
            return vo1.B("ChaloConfigFetchFailed(msg=", this.f6658a, ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/onboarding/languageselection/LanguageSelectionSnackbarType$HomeScreenConfigFetchFailed;", "Lapp/chalo/onboarding/languageselection/LanguageSelectionSnackbarType;", "onboarding_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class HomeScreenConfigFetchFailed extends LanguageSelectionSnackbarType {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f6659a;

        public HomeScreenConfigFetchFailed(String msg) {
            Intrinsics.i(msg, "msg");
            this.f6659a = msg;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof HomeScreenConfigFetchFailed) && Intrinsics.d(this.f6659a, ((HomeScreenConfigFetchFailed) obj).f6659a);
        }

        public final int hashCode() {
            return this.f6659a.hashCode();
        }

        public final String toString() {
            return vo1.B("HomeScreenConfigFetchFailed(msg=", this.f6659a, ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/onboarding/languageselection/LanguageSelectionSnackbarType$LanguageDownloadFailed;", "Lapp/chalo/onboarding/languageselection/LanguageSelectionSnackbarType;", "onboarding_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class LanguageDownloadFailed extends LanguageSelectionSnackbarType {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final LanguageDownloadFailed f6660a = new LanguageDownloadFailed();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/onboarding/languageselection/LanguageSelectionSnackbarType$None;", "Lapp/chalo/onboarding/languageselection/LanguageSelectionSnackbarType;", "onboarding_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class None extends LanguageSelectionSnackbarType {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final None f6661a = new None();
    }
}
