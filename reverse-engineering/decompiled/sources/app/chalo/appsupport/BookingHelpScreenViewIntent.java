package app.chalo.appsupport;

import app.chalo.models.bookinghelp.BookingHelpFaqActionType;
import app.chalo.scenes.args.BookingCancellationTarget;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\f"}, d2 = {"Lapp/chalo/appsupport/BookingHelpScreenViewIntent;", "", "InitialisationIntent", "OnFaqActionClicked", "OnBottomSheetPositiveButtonClicked", "OnBottomSheetNegativeButtonClicked", "OnBottomSheetDismissed", "Lapp/chalo/appsupport/BookingHelpScreenViewIntent$InitialisationIntent;", "Lapp/chalo/appsupport/BookingHelpScreenViewIntent$OnBottomSheetDismissed;", "Lapp/chalo/appsupport/BookingHelpScreenViewIntent$OnBottomSheetNegativeButtonClicked;", "Lapp/chalo/appsupport/BookingHelpScreenViewIntent$OnBottomSheetPositiveButtonClicked;", "Lapp/chalo/appsupport/BookingHelpScreenViewIntent$OnFaqActionClicked;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class BookingHelpScreenViewIntent {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/appsupport/BookingHelpScreenViewIntent$InitialisationIntent;", "Lapp/chalo/appsupport/BookingHelpScreenViewIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class InitialisationIntent extends BookingHelpScreenViewIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List f970a;
        public final BookingCancellationTarget b;

        public InitialisationIntent(List faqList, BookingCancellationTarget target) {
            Intrinsics.i(faqList, "faqList");
            Intrinsics.i(target, "target");
            this.f970a = faqList;
            this.b = target;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof InitialisationIntent)) {
                return false;
            }
            InitialisationIntent initialisationIntent = (InitialisationIntent) obj;
            return Intrinsics.d(this.f970a, initialisationIntent.f970a) && Intrinsics.d(this.b, initialisationIntent.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f970a.hashCode() * 31);
        }

        public final String toString() {
            return "InitialisationIntent(faqList=" + this.f970a + ", target=" + this.b + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/appsupport/BookingHelpScreenViewIntent$OnBottomSheetDismissed;", "Lapp/chalo/appsupport/BookingHelpScreenViewIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class OnBottomSheetDismissed extends BookingHelpScreenViewIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final BookingHelpBottomSheetType f971a;

        public OnBottomSheetDismissed(BookingHelpBottomSheetType bottomSheetType) {
            Intrinsics.i(bottomSheetType, "bottomSheetType");
            this.f971a = bottomSheetType;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnBottomSheetDismissed) && Intrinsics.d(this.f971a, ((OnBottomSheetDismissed) obj).f971a);
        }

        public final int hashCode() {
            return this.f971a.hashCode();
        }

        public final String toString() {
            return "OnBottomSheetDismissed(bottomSheetType=" + this.f971a + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/appsupport/BookingHelpScreenViewIntent$OnBottomSheetNegativeButtonClicked;", "Lapp/chalo/appsupport/BookingHelpScreenViewIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class OnBottomSheetNegativeButtonClicked extends BookingHelpScreenViewIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final BookingHelpBottomSheetType f972a;

        public OnBottomSheetNegativeButtonClicked(BookingHelpBottomSheetType bottomSheetType) {
            Intrinsics.i(bottomSheetType, "bottomSheetType");
            this.f972a = bottomSheetType;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnBottomSheetNegativeButtonClicked) && Intrinsics.d(this.f972a, ((OnBottomSheetNegativeButtonClicked) obj).f972a);
        }

        public final int hashCode() {
            return this.f972a.hashCode();
        }

        public final String toString() {
            return "OnBottomSheetNegativeButtonClicked(bottomSheetType=" + this.f972a + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/appsupport/BookingHelpScreenViewIntent$OnBottomSheetPositiveButtonClicked;", "Lapp/chalo/appsupport/BookingHelpScreenViewIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class OnBottomSheetPositiveButtonClicked extends BookingHelpScreenViewIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final BookingHelpBottomSheetType f973a;

        public OnBottomSheetPositiveButtonClicked(BookingHelpBottomSheetType bottomSheetType) {
            Intrinsics.i(bottomSheetType, "bottomSheetType");
            this.f973a = bottomSheetType;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnBottomSheetPositiveButtonClicked) && Intrinsics.d(this.f973a, ((OnBottomSheetPositiveButtonClicked) obj).f973a);
        }

        public final int hashCode() {
            return this.f973a.hashCode();
        }

        public final String toString() {
            return "OnBottomSheetPositiveButtonClicked(bottomSheetType=" + this.f973a + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/appsupport/BookingHelpScreenViewIntent$OnFaqActionClicked;", "Lapp/chalo/appsupport/BookingHelpScreenViewIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class OnFaqActionClicked extends BookingHelpScreenViewIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final BookingHelpFaqActionType f974a;

        public OnFaqActionClicked(BookingHelpFaqActionType actionType) {
            Intrinsics.i(actionType, "actionType");
            this.f974a = actionType;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnFaqActionClicked) && this.f974a == ((OnFaqActionClicked) obj).f974a;
        }

        public final int hashCode() {
            return this.f974a.hashCode();
        }

        public final String toString() {
            return "OnFaqActionClicked(actionType=" + this.f974a + ")";
        }
    }
}
