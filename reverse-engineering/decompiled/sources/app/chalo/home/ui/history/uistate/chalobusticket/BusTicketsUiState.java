package app.chalo.home.ui.history.uistate.chalobusticket;

import app.chalo.home.ui.history.uistate.regularbusticket.RegularBusTicketUiState;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/home/ui/history/uistate/chalobusticket/BusTicketsUiState;", "", "RegularBus", "ChaloBus", "Lapp/chalo/home/ui/history/uistate/chalobusticket/BusTicketsUiState$ChaloBus;", "Lapp/chalo/home/ui/history/uistate/chalobusticket/BusTicketsUiState$RegularBus;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class BusTicketsUiState {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/ui/history/uistate/chalobusticket/BusTicketsUiState$ChaloBus;", "Lapp/chalo/home/ui/history/uistate/chalobusticket/BusTicketsUiState;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ChaloBus extends BusTicketsUiState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ChaloBusTicketUiState f3496a;

        public ChaloBus(ChaloBusTicketUiState ticket) {
            Intrinsics.i(ticket, "ticket");
            this.f3496a = ticket;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ChaloBus) && Intrinsics.d(this.f3496a, ((ChaloBus) obj).f3496a);
        }

        public final int hashCode() {
            return this.f3496a.hashCode();
        }

        public final String toString() {
            return "ChaloBus(ticket=" + this.f3496a + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/ui/history/uistate/chalobusticket/BusTicketsUiState$RegularBus;", "Lapp/chalo/home/ui/history/uistate/chalobusticket/BusTicketsUiState;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class RegularBus extends BusTicketsUiState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final RegularBusTicketUiState f3497a;

        public RegularBus(RegularBusTicketUiState ticket) {
            Intrinsics.i(ticket, "ticket");
            this.f3497a = ticket;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof RegularBus) && Intrinsics.d(this.f3497a, ((RegularBus) obj).f3497a);
        }

        public final int hashCode() {
            return this.f3497a.hashCode();
        }

        public final String toString() {
            return "RegularBus(ticket=" + this.f3497a + ")";
        }
    }
}
