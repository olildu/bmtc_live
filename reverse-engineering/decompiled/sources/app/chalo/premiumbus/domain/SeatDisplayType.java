package app.chalo.premiumbus.domain;

import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0006\b\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"Lapp/chalo/premiumbus/domain/SeatDisplayType;", "", "GeneralAvailableSeat", "GeneralUnavailableSeat", "WomenActiveBufferAvailableSeat", "WomenActiveBufferUnavailableSeat", "WomenInactiveBufferAvailableSeat", "WomenInactiveBufferUnavailableSeat", "Lapp/chalo/premiumbus/domain/SeatDisplayType$GeneralAvailableSeat;", "Lapp/chalo/premiumbus/domain/SeatDisplayType$GeneralUnavailableSeat;", "Lapp/chalo/premiumbus/domain/SeatDisplayType$WomenActiveBufferAvailableSeat;", "Lapp/chalo/premiumbus/domain/SeatDisplayType$WomenActiveBufferUnavailableSeat;", "Lapp/chalo/premiumbus/domain/SeatDisplayType$WomenInactiveBufferAvailableSeat;", "Lapp/chalo/premiumbus/domain/SeatDisplayType$WomenInactiveBufferUnavailableSeat;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class SeatDisplayType {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/domain/SeatDisplayType$GeneralAvailableSeat;", "Lapp/chalo/premiumbus/domain/SeatDisplayType;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class GeneralAvailableSeat extends SeatDisplayType {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final GeneralAvailableSeat f7251a = new GeneralAvailableSeat();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof GeneralAvailableSeat);
        }

        public final int hashCode() {
            return -1802723330;
        }

        public final String toString() {
            return "GeneralAvailableSeat";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/domain/SeatDisplayType$GeneralUnavailableSeat;", "Lapp/chalo/premiumbus/domain/SeatDisplayType;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class GeneralUnavailableSeat extends SeatDisplayType {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final GeneralUnavailableSeat f7252a = new GeneralUnavailableSeat();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof GeneralUnavailableSeat);
        }

        public final int hashCode() {
            return 445066757;
        }

        public final String toString() {
            return "GeneralUnavailableSeat";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/domain/SeatDisplayType$WomenActiveBufferAvailableSeat;", "Lapp/chalo/premiumbus/domain/SeatDisplayType;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class WomenActiveBufferAvailableSeat extends SeatDisplayType {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final WomenActiveBufferAvailableSeat f7253a = new WomenActiveBufferAvailableSeat();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof WomenActiveBufferAvailableSeat);
        }

        public final int hashCode() {
            return -631421342;
        }

        public final String toString() {
            return "WomenActiveBufferAvailableSeat";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/domain/SeatDisplayType$WomenActiveBufferUnavailableSeat;", "Lapp/chalo/premiumbus/domain/SeatDisplayType;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class WomenActiveBufferUnavailableSeat extends SeatDisplayType {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final WomenActiveBufferUnavailableSeat f7254a = new WomenActiveBufferUnavailableSeat();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof WomenActiveBufferUnavailableSeat);
        }

        public final int hashCode() {
            return 784845673;
        }

        public final String toString() {
            return "WomenActiveBufferUnavailableSeat";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/domain/SeatDisplayType$WomenInactiveBufferAvailableSeat;", "Lapp/chalo/premiumbus/domain/SeatDisplayType;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class WomenInactiveBufferAvailableSeat extends SeatDisplayType {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final WomenInactiveBufferAvailableSeat f7255a = new WomenInactiveBufferAvailableSeat();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof WomenInactiveBufferAvailableSeat);
        }

        public final int hashCode() {
            return -1679362467;
        }

        public final String toString() {
            return "WomenInactiveBufferAvailableSeat";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/domain/SeatDisplayType$WomenInactiveBufferUnavailableSeat;", "Lapp/chalo/premiumbus/domain/SeatDisplayType;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class WomenInactiveBufferUnavailableSeat extends SeatDisplayType {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final WomenInactiveBufferUnavailableSeat f7256a = new WomenInactiveBufferUnavailableSeat();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof WomenInactiveBufferUnavailableSeat);
        }

        public final int hashCode() {
            return -1264228188;
        }

        public final String toString() {
            return "WomenInactiveBufferUnavailableSeat";
        }
    }
}
