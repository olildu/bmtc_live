package app.chalo.productpurchase.passpurchase.ui.passengerselection;

import app.chalo.superpass.data.models.entities.SuperPassUserDetails;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lapp/chalo/productpurchase/passpurchase/ui/passengerselection/SuperPassPassengerSelectionIntent;", "", "InitializationIntent", "PassengerSelectedIntent", "AddNewPassengerIntent", "Lapp/chalo/productpurchase/passpurchase/ui/passengerselection/SuperPassPassengerSelectionIntent$AddNewPassengerIntent;", "Lapp/chalo/productpurchase/passpurchase/ui/passengerselection/SuperPassPassengerSelectionIntent$InitializationIntent;", "Lapp/chalo/productpurchase/passpurchase/ui/passengerselection/SuperPassPassengerSelectionIntent$PassengerSelectedIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class SuperPassPassengerSelectionIntent {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productpurchase/passpurchase/ui/passengerselection/SuperPassPassengerSelectionIntent$AddNewPassengerIntent;", "Lapp/chalo/productpurchase/passpurchase/ui/passengerselection/SuperPassPassengerSelectionIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class AddNewPassengerIntent extends SuperPassPassengerSelectionIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final AddNewPassengerIntent f8446a = new AddNewPassengerIntent();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof AddNewPassengerIntent);
        }

        public final int hashCode() {
            return 10325535;
        }

        public final String toString() {
            return "AddNewPassengerIntent";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productpurchase/passpurchase/ui/passengerselection/SuperPassPassengerSelectionIntent$InitializationIntent;", "Lapp/chalo/productpurchase/passpurchase/ui/passengerselection/SuperPassPassengerSelectionIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class InitializationIntent extends SuperPassPassengerSelectionIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final InitializationIntent f8447a = new InitializationIntent();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof InitializationIntent);
        }

        public final int hashCode() {
            return -914937644;
        }

        public final String toString() {
            return "InitializationIntent";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productpurchase/passpurchase/ui/passengerselection/SuperPassPassengerSelectionIntent$PassengerSelectedIntent;", "Lapp/chalo/productpurchase/passpurchase/ui/passengerselection/SuperPassPassengerSelectionIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class PassengerSelectedIntent extends SuperPassPassengerSelectionIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final SuperPassUserDetails f8448a;

        public PassengerSelectedIntent(SuperPassUserDetails superPassUserDetails) {
            this.f8448a = superPassUserDetails;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof PassengerSelectedIntent) && Intrinsics.d(this.f8448a, ((PassengerSelectedIntent) obj).f8448a);
        }

        public final int hashCode() {
            return this.f8448a.hashCode();
        }

        public final String toString() {
            return "PassengerSelectedIntent(data=" + this.f8448a + ")";
        }
    }
}
