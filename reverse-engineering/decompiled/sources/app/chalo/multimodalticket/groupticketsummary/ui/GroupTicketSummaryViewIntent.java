package app.chalo.multimodalticket.groupticketsummary.ui;

import app.chalo.scenes.args.GroupTicketBookingSummaryArgs;
import defpackage.b3;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\t\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u0082\u0001\t\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013¨\u0006\u0014"}, d2 = {"Lapp/chalo/multimodalticket/groupticketsummary/ui/GroupTicketSummaryViewIntent;", "", "InitialisationIntent", "OnBackButtonClicked", "OnRetryPriceDetailsFetchClicked", "OnTermsAndConditionsClicked", "TnCAcceptClickIntent", "OnPayButtonClicked", "OnTripDetailsToggleClicked", "OnEditTicketsClicked", "OnLegFareRowClicked", "Lapp/chalo/multimodalticket/groupticketsummary/ui/GroupTicketSummaryViewIntent$InitialisationIntent;", "Lapp/chalo/multimodalticket/groupticketsummary/ui/GroupTicketSummaryViewIntent$OnBackButtonClicked;", "Lapp/chalo/multimodalticket/groupticketsummary/ui/GroupTicketSummaryViewIntent$OnEditTicketsClicked;", "Lapp/chalo/multimodalticket/groupticketsummary/ui/GroupTicketSummaryViewIntent$OnLegFareRowClicked;", "Lapp/chalo/multimodalticket/groupticketsummary/ui/GroupTicketSummaryViewIntent$OnPayButtonClicked;", "Lapp/chalo/multimodalticket/groupticketsummary/ui/GroupTicketSummaryViewIntent$OnRetryPriceDetailsFetchClicked;", "Lapp/chalo/multimodalticket/groupticketsummary/ui/GroupTicketSummaryViewIntent$OnTermsAndConditionsClicked;", "Lapp/chalo/multimodalticket/groupticketsummary/ui/GroupTicketSummaryViewIntent$OnTripDetailsToggleClicked;", "Lapp/chalo/multimodalticket/groupticketsummary/ui/GroupTicketSummaryViewIntent$TnCAcceptClickIntent;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class GroupTicketSummaryViewIntent {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/multimodalticket/groupticketsummary/ui/GroupTicketSummaryViewIntent$InitialisationIntent;", "Lapp/chalo/multimodalticket/groupticketsummary/ui/GroupTicketSummaryViewIntent;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class InitialisationIntent extends GroupTicketSummaryViewIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final GroupTicketBookingSummaryArgs f5903a;

        static {
            GroupTicketBookingSummaryArgs.Companion companion = GroupTicketBookingSummaryArgs.INSTANCE;
        }

        public InitialisationIntent(GroupTicketBookingSummaryArgs groupTicketBookingSummaryArgs) {
            this.f5903a = groupTicketBookingSummaryArgs;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof InitialisationIntent) && Intrinsics.d(this.f5903a, ((InitialisationIntent) obj).f5903a);
        }

        public final int hashCode() {
            return this.f5903a.hashCode();
        }

        public final String toString() {
            return "InitialisationIntent(bookingSummaryArgs=" + this.f5903a + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/multimodalticket/groupticketsummary/ui/GroupTicketSummaryViewIntent$OnBackButtonClicked;", "Lapp/chalo/multimodalticket/groupticketsummary/ui/GroupTicketSummaryViewIntent;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class OnBackButtonClicked extends GroupTicketSummaryViewIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final OnBackButtonClicked f5904a = new OnBackButtonClicked();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/multimodalticket/groupticketsummary/ui/GroupTicketSummaryViewIntent$OnEditTicketsClicked;", "Lapp/chalo/multimodalticket/groupticketsummary/ui/GroupTicketSummaryViewIntent;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class OnEditTicketsClicked extends GroupTicketSummaryViewIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final OnEditTicketsClicked f5905a = new OnEditTicketsClicked();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/multimodalticket/groupticketsummary/ui/GroupTicketSummaryViewIntent$OnLegFareRowClicked;", "Lapp/chalo/multimodalticket/groupticketsummary/ui/GroupTicketSummaryViewIntent;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class OnLegFareRowClicked extends GroupTicketSummaryViewIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f5906a;

        public OnLegFareRowClicked(int i) {
            this.f5906a = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnLegFareRowClicked) && this.f5906a == ((OnLegFareRowClicked) obj).f5906a;
        }

        /* JADX INFO: renamed from: hashCode, reason: from getter */
        public final int getF5906a() {
            return this.f5906a;
        }

        public final String toString() {
            return b3.d(this.f5906a, "OnLegFareRowClicked(sequence=", ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/multimodalticket/groupticketsummary/ui/GroupTicketSummaryViewIntent$OnPayButtonClicked;", "Lapp/chalo/multimodalticket/groupticketsummary/ui/GroupTicketSummaryViewIntent;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class OnPayButtonClicked extends GroupTicketSummaryViewIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final OnPayButtonClicked f5907a = new OnPayButtonClicked();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/multimodalticket/groupticketsummary/ui/GroupTicketSummaryViewIntent$OnRetryPriceDetailsFetchClicked;", "Lapp/chalo/multimodalticket/groupticketsummary/ui/GroupTicketSummaryViewIntent;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class OnRetryPriceDetailsFetchClicked extends GroupTicketSummaryViewIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final OnRetryPriceDetailsFetchClicked f5908a = new OnRetryPriceDetailsFetchClicked();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/multimodalticket/groupticketsummary/ui/GroupTicketSummaryViewIntent$OnTermsAndConditionsClicked;", "Lapp/chalo/multimodalticket/groupticketsummary/ui/GroupTicketSummaryViewIntent;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class OnTermsAndConditionsClicked extends GroupTicketSummaryViewIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final OnTermsAndConditionsClicked f5909a = new OnTermsAndConditionsClicked();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/multimodalticket/groupticketsummary/ui/GroupTicketSummaryViewIntent$OnTripDetailsToggleClicked;", "Lapp/chalo/multimodalticket/groupticketsummary/ui/GroupTicketSummaryViewIntent;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class OnTripDetailsToggleClicked extends GroupTicketSummaryViewIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final OnTripDetailsToggleClicked f5910a = new OnTripDetailsToggleClicked();
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/multimodalticket/groupticketsummary/ui/GroupTicketSummaryViewIntent$TnCAcceptClickIntent;", "Lapp/chalo/multimodalticket/groupticketsummary/ui/GroupTicketSummaryViewIntent;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class TnCAcceptClickIntent extends GroupTicketSummaryViewIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final TnCAcceptClickIntent f5911a = new TnCAcceptClickIntent();
    }
}
