package app.chalo.premiumbus.ui.seatselection;

import defpackage.b3;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\f"}, d2 = {"Lapp/chalo/premiumbus/ui/seatselection/SeatToggleDecision;", "", "Toggle", "ClearSelectionsAndToggle", "BlockedMaxSeats", "BlockedWomenSeatsMix", "BlockedSeatUnavailable", "Lapp/chalo/premiumbus/ui/seatselection/SeatToggleDecision$BlockedMaxSeats;", "Lapp/chalo/premiumbus/ui/seatselection/SeatToggleDecision$BlockedSeatUnavailable;", "Lapp/chalo/premiumbus/ui/seatselection/SeatToggleDecision$BlockedWomenSeatsMix;", "Lapp/chalo/premiumbus/ui/seatselection/SeatToggleDecision$ClearSelectionsAndToggle;", "Lapp/chalo/premiumbus/ui/seatselection/SeatToggleDecision$Toggle;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface SeatToggleDecision {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/ui/seatselection/SeatToggleDecision$BlockedMaxSeats;", "Lapp/chalo/premiumbus/ui/seatselection/SeatToggleDecision;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class BlockedMaxSeats implements SeatToggleDecision {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f7758a;

        public BlockedMaxSeats(int i) {
            this.f7758a = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof BlockedMaxSeats) && this.f7758a == ((BlockedMaxSeats) obj).f7758a;
        }

        /* JADX INFO: renamed from: hashCode, reason: from getter */
        public final int getF7758a() {
            return this.f7758a;
        }

        public final String toString() {
            return b3.d(this.f7758a, "BlockedMaxSeats(maxAllowed=", ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/ui/seatselection/SeatToggleDecision$BlockedSeatUnavailable;", "Lapp/chalo/premiumbus/ui/seatselection/SeatToggleDecision;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class BlockedSeatUnavailable implements SeatToggleDecision {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final BlockedSeatUnavailable f7759a = new BlockedSeatUnavailable();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof BlockedSeatUnavailable);
        }

        public final int hashCode() {
            return -449880608;
        }

        public final String toString() {
            return "BlockedSeatUnavailable";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/ui/seatselection/SeatToggleDecision$BlockedWomenSeatsMix;", "Lapp/chalo/premiumbus/ui/seatselection/SeatToggleDecision;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class BlockedWomenSeatsMix implements SeatToggleDecision {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final BlockedWomenSeatsMix f7760a = new BlockedWomenSeatsMix();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof BlockedWomenSeatsMix);
        }

        public final int hashCode() {
            return 636463265;
        }

        public final String toString() {
            return "BlockedWomenSeatsMix";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/ui/seatselection/SeatToggleDecision$ClearSelectionsAndToggle;", "Lapp/chalo/premiumbus/ui/seatselection/SeatToggleDecision;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ClearSelectionsAndToggle implements SeatToggleDecision {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ClearSelectionsAndToggle f7761a = new ClearSelectionsAndToggle();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ClearSelectionsAndToggle);
        }

        public final int hashCode() {
            return 1334980600;
        }

        public final String toString() {
            return "ClearSelectionsAndToggle";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/ui/seatselection/SeatToggleDecision$Toggle;", "Lapp/chalo/premiumbus/ui/seatselection/SeatToggleDecision;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Toggle implements SeatToggleDecision {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Toggle f7762a = new Toggle();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Toggle);
        }

        public final int hashCode() {
            return -374633035;
        }

        public final String toString() {
            return "Toggle";
        }
    }
}
