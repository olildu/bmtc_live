package app.chalo.onboarding.languageselection;

import app.chalo.features.language.data.LanguageSelectionSourceType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\f"}, d2 = {"Lapp/chalo/onboarding/languageselection/LanguageSelectionIntent;", "", "InitializationIntent", "LanguageSelected", "TncTextClicked", "ContinueClicked", "SnackbarRetryClicked", "Lapp/chalo/onboarding/languageselection/LanguageSelectionIntent$ContinueClicked;", "Lapp/chalo/onboarding/languageselection/LanguageSelectionIntent$InitializationIntent;", "Lapp/chalo/onboarding/languageselection/LanguageSelectionIntent$LanguageSelected;", "Lapp/chalo/onboarding/languageselection/LanguageSelectionIntent$SnackbarRetryClicked;", "Lapp/chalo/onboarding/languageselection/LanguageSelectionIntent$TncTextClicked;", "onboarding_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class LanguageSelectionIntent {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/onboarding/languageselection/LanguageSelectionIntent$ContinueClicked;", "Lapp/chalo/onboarding/languageselection/LanguageSelectionIntent;", "onboarding_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ContinueClicked extends LanguageSelectionIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ContinueClicked f6652a = new ContinueClicked();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/onboarding/languageselection/LanguageSelectionIntent$InitializationIntent;", "Lapp/chalo/onboarding/languageselection/LanguageSelectionIntent;", "onboarding_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class InitializationIntent extends LanguageSelectionIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final LanguageSelectionSourceType f6653a;

        public InitializationIntent(LanguageSelectionSourceType source) {
            Intrinsics.i(source, "source");
            this.f6653a = source;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof InitializationIntent) && this.f6653a == ((InitializationIntent) obj).f6653a;
        }

        public final int hashCode() {
            return this.f6653a.hashCode();
        }

        public final String toString() {
            return "InitializationIntent(source=" + this.f6653a + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/onboarding/languageselection/LanguageSelectionIntent$LanguageSelected;", "Lapp/chalo/onboarding/languageselection/LanguageSelectionIntent;", "onboarding_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class LanguageSelected extends LanguageSelectionIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final LanguageDetails f6654a;

        public LanguageSelected(LanguageDetails languageDetails) {
            this.f6654a = languageDetails;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof LanguageSelected) && Intrinsics.d(this.f6654a, ((LanguageSelected) obj).f6654a);
        }

        public final int hashCode() {
            return this.f6654a.hashCode();
        }

        public final String toString() {
            return "LanguageSelected(languageDetails=" + this.f6654a + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/onboarding/languageselection/LanguageSelectionIntent$SnackbarRetryClicked;", "Lapp/chalo/onboarding/languageselection/LanguageSelectionIntent;", "onboarding_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SnackbarRetryClicked extends LanguageSelectionIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final LanguageSelectionSnackbarType f6655a;

        public SnackbarRetryClicked(LanguageSelectionSnackbarType snackbarType) {
            Intrinsics.i(snackbarType, "snackbarType");
            this.f6655a = snackbarType;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SnackbarRetryClicked) && Intrinsics.d(this.f6655a, ((SnackbarRetryClicked) obj).f6655a);
        }

        public final int hashCode() {
            return this.f6655a.hashCode();
        }

        public final String toString() {
            return "SnackbarRetryClicked(snackbarType=" + this.f6655a + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/onboarding/languageselection/LanguageSelectionIntent$TncTextClicked;", "Lapp/chalo/onboarding/languageselection/LanguageSelectionIntent;", "onboarding_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class TncTextClicked extends LanguageSelectionIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final TncTextClicked f6656a = new TncTextClicked();
    }
}
