package app.chalo.bookingsuccess;

import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lapp/chalo/bookingsuccess/BookingSuccessIntent;", "", "InitializationIntent", "OnPositiveBtnClickedIntent", "OnNegativeBtnClickedIntent", "OnAnimationCompletedIntent", "Lapp/chalo/bookingsuccess/BookingSuccessIntent$InitializationIntent;", "Lapp/chalo/bookingsuccess/BookingSuccessIntent$OnAnimationCompletedIntent;", "Lapp/chalo/bookingsuccess/BookingSuccessIntent$OnNegativeBtnClickedIntent;", "Lapp/chalo/bookingsuccess/BookingSuccessIntent$OnPositiveBtnClickedIntent;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class BookingSuccessIntent {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/bookingsuccess/BookingSuccessIntent$InitializationIntent;", "Lapp/chalo/bookingsuccess/BookingSuccessIntent;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class InitializationIntent extends BookingSuccessIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final InitializationIntent f1150a = new InitializationIntent();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof InitializationIntent);
        }

        public final int hashCode() {
            return -1491889764;
        }

        public final String toString() {
            return "InitializationIntent";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/bookingsuccess/BookingSuccessIntent$OnAnimationCompletedIntent;", "Lapp/chalo/bookingsuccess/BookingSuccessIntent;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class OnAnimationCompletedIntent extends BookingSuccessIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final OnAnimationCompletedIntent f1151a = new OnAnimationCompletedIntent();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof OnAnimationCompletedIntent);
        }

        public final int hashCode() {
            return -1803150366;
        }

        public final String toString() {
            return "OnAnimationCompletedIntent";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/bookingsuccess/BookingSuccessIntent$OnNegativeBtnClickedIntent;", "Lapp/chalo/bookingsuccess/BookingSuccessIntent;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class OnNegativeBtnClickedIntent extends BookingSuccessIntent {
        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof OnNegativeBtnClickedIntent);
        }

        public final int hashCode() {
            return -1103336901;
        }

        public final String toString() {
            return "OnNegativeBtnClickedIntent";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/bookingsuccess/BookingSuccessIntent$OnPositiveBtnClickedIntent;", "Lapp/chalo/bookingsuccess/BookingSuccessIntent;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class OnPositiveBtnClickedIntent extends BookingSuccessIntent {
        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof OnPositiveBtnClickedIntent);
        }

        public final int hashCode() {
            return 1329328127;
        }

        public final String toString() {
            return "OnPositiveBtnClickedIntent";
        }
    }
}
