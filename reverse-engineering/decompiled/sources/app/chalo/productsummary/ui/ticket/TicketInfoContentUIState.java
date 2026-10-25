package app.chalo.productsummary.ui.ticket;

import app.chalo.compose.theme.UIShape;
import app.chalo.productsummary.ui.data.RouteDetailInfoUIState;
import app.chalo.productsummary.ui.data.UserInfoUIState;
import app.chalo.uistate.components.RegularBusTicketTripDetailsUiState;
import app.chalo.uistate.text.TitleSubtitleUiState;
import app.chalo.uistate.textwithleftandtrailingrighticon.TextWithLeftAndRightIconUIState;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\n\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\u0082\u0001\n\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015¨\u0006\u0016"}, d2 = {"Lapp/chalo/productsummary/ui/ticket/TicketInfoContentUIState;", "", "RouteDetailInfo", "MultiModalJourney", "ValidatedAt", "ExpiredAt", "VehicleNumber", "NumberOfTickets", "UserInfo", "ConductorId", "TicketNumber", "SeatNumbers", "Lapp/chalo/productsummary/ui/ticket/TicketInfoContentUIState$ConductorId;", "Lapp/chalo/productsummary/ui/ticket/TicketInfoContentUIState$ExpiredAt;", "Lapp/chalo/productsummary/ui/ticket/TicketInfoContentUIState$MultiModalJourney;", "Lapp/chalo/productsummary/ui/ticket/TicketInfoContentUIState$NumberOfTickets;", "Lapp/chalo/productsummary/ui/ticket/TicketInfoContentUIState$RouteDetailInfo;", "Lapp/chalo/productsummary/ui/ticket/TicketInfoContentUIState$SeatNumbers;", "Lapp/chalo/productsummary/ui/ticket/TicketInfoContentUIState$TicketNumber;", "Lapp/chalo/productsummary/ui/ticket/TicketInfoContentUIState$UserInfo;", "Lapp/chalo/productsummary/ui/ticket/TicketInfoContentUIState$ValidatedAt;", "Lapp/chalo/productsummary/ui/ticket/TicketInfoContentUIState$VehicleNumber;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class TicketInfoContentUIState {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productsummary/ui/ticket/TicketInfoContentUIState$ConductorId;", "Lapp/chalo/productsummary/ui/ticket/TicketInfoContentUIState;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ConductorId extends TicketInfoContentUIState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TitleSubtitleUiState f8790a;

        public ConductorId(TitleSubtitleUiState titleSubtitleUiState) {
            this.f8790a = titleSubtitleUiState;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ConductorId) && Intrinsics.d(this.f8790a, ((ConductorId) obj).f8790a);
        }

        public final int hashCode() {
            return this.f8790a.hashCode();
        }

        public final String toString() {
            return "ConductorId(conductorIdUIState=" + this.f8790a + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productsummary/ui/ticket/TicketInfoContentUIState$ExpiredAt;", "Lapp/chalo/productsummary/ui/ticket/TicketInfoContentUIState;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ExpiredAt extends TicketInfoContentUIState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TitleSubtitleUiState f8791a;

        public ExpiredAt(TitleSubtitleUiState titleSubtitleUiState) {
            this.f8791a = titleSubtitleUiState;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ExpiredAt) && Intrinsics.d(this.f8791a, ((ExpiredAt) obj).f8791a);
        }

        public final int hashCode() {
            return this.f8791a.hashCode();
        }

        public final String toString() {
            return "ExpiredAt(expiredAtUIState=" + this.f8791a + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productsummary/ui/ticket/TicketInfoContentUIState$MultiModalJourney;", "Lapp/chalo/productsummary/ui/ticket/TicketInfoContentUIState;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class MultiModalJourney extends TicketInfoContentUIState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final RegularBusTicketTripDetailsUiState f8792a;

        public MultiModalJourney(RegularBusTicketTripDetailsUiState regularBusTicketTripDetailsUiState) {
            this.f8792a = regularBusTicketTripDetailsUiState;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof MultiModalJourney) && Intrinsics.d(this.f8792a, ((MultiModalJourney) obj).f8792a);
        }

        public final int hashCode() {
            return this.f8792a.hashCode();
        }

        public final String toString() {
            return "MultiModalJourney(tripDetailsUiState=" + this.f8792a + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productsummary/ui/ticket/TicketInfoContentUIState$NumberOfTickets;", "Lapp/chalo/productsummary/ui/ticket/TicketInfoContentUIState;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class NumberOfTickets extends TicketInfoContentUIState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TextWithLeftAndRightIconUIState f8793a;

        public NumberOfTickets(TextWithLeftAndRightIconUIState textWithLeftAndRightIconUIState) {
            this.f8793a = textWithLeftAndRightIconUIState;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof NumberOfTickets) && Intrinsics.d(this.f8793a, ((NumberOfTickets) obj).f8793a);
        }

        public final int hashCode() {
            return this.f8793a.hashCode();
        }

        public final String toString() {
            return "NumberOfTickets(numberOfTickets=" + this.f8793a + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productsummary/ui/ticket/TicketInfoContentUIState$RouteDetailInfo;", "Lapp/chalo/productsummary/ui/ticket/TicketInfoContentUIState;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class RouteDetailInfo extends TicketInfoContentUIState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final RouteDetailInfoUIState f8794a;

        static {
            UIShape.Rectangle rectangle = UIShape.f1926a;
        }

        public RouteDetailInfo(RouteDetailInfoUIState routeDetailInfoUIState) {
            this.f8794a = routeDetailInfoUIState;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof RouteDetailInfo) && Intrinsics.d(this.f8794a, ((RouteDetailInfo) obj).f8794a);
        }

        public final int hashCode() {
            return this.f8794a.hashCode();
        }

        public final String toString() {
            return "RouteDetailInfo(routeDetailInfoUIState=" + this.f8794a + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productsummary/ui/ticket/TicketInfoContentUIState$SeatNumbers;", "Lapp/chalo/productsummary/ui/ticket/TicketInfoContentUIState;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SeatNumbers extends TicketInfoContentUIState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TitleSubtitleUiState f8795a;

        public SeatNumbers(TitleSubtitleUiState titleSubtitleUiState) {
            this.f8795a = titleSubtitleUiState;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SeatNumbers) && Intrinsics.d(this.f8795a, ((SeatNumbers) obj).f8795a);
        }

        public final int hashCode() {
            return this.f8795a.hashCode();
        }

        public final String toString() {
            return "SeatNumbers(seatNumberUIState=" + this.f8795a + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productsummary/ui/ticket/TicketInfoContentUIState$TicketNumber;", "Lapp/chalo/productsummary/ui/ticket/TicketInfoContentUIState;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class TicketNumber extends TicketInfoContentUIState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TitleSubtitleUiState f8796a;

        public TicketNumber(TitleSubtitleUiState titleSubtitleUiState) {
            this.f8796a = titleSubtitleUiState;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof TicketNumber) && Intrinsics.d(this.f8796a, ((TicketNumber) obj).f8796a);
        }

        public final int hashCode() {
            return this.f8796a.hashCode();
        }

        public final String toString() {
            return "TicketNumber(ticketNumberUIState=" + this.f8796a + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productsummary/ui/ticket/TicketInfoContentUIState$UserInfo;", "Lapp/chalo/productsummary/ui/ticket/TicketInfoContentUIState;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class UserInfo extends TicketInfoContentUIState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final UserInfoUIState f8797a;

        public UserInfo(UserInfoUIState userInfoUIState) {
            this.f8797a = userInfoUIState;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof UserInfo) && Intrinsics.d(this.f8797a, ((UserInfo) obj).f8797a);
        }

        public final int hashCode() {
            return this.f8797a.hashCode();
        }

        public final String toString() {
            return "UserInfo(userInfoUIState=" + this.f8797a + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productsummary/ui/ticket/TicketInfoContentUIState$ValidatedAt;", "Lapp/chalo/productsummary/ui/ticket/TicketInfoContentUIState;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ValidatedAt extends TicketInfoContentUIState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TitleSubtitleUiState f8798a;

        public ValidatedAt(TitleSubtitleUiState titleSubtitleUiState) {
            this.f8798a = titleSubtitleUiState;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ValidatedAt) && Intrinsics.d(this.f8798a, ((ValidatedAt) obj).f8798a);
        }

        public final int hashCode() {
            return this.f8798a.hashCode();
        }

        public final String toString() {
            return "ValidatedAt(validatedAtUIState=" + this.f8798a + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productsummary/ui/ticket/TicketInfoContentUIState$VehicleNumber;", "Lapp/chalo/productsummary/ui/ticket/TicketInfoContentUIState;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class VehicleNumber extends TicketInfoContentUIState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TitleSubtitleUiState f8799a;

        public VehicleNumber(TitleSubtitleUiState titleSubtitleUiState) {
            this.f8799a = titleSubtitleUiState;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof VehicleNumber) && Intrinsics.d(this.f8799a, ((VehicleNumber) obj).f8799a);
        }

        public final int hashCode() {
            return this.f8799a.hashCode();
        }

        public final String toString() {
            return "VehicleNumber(vehicleNumberUIState=" + this.f8799a + ")";
        }
    }
}
