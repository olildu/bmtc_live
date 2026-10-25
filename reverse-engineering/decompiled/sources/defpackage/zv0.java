package defpackage;

import androidx.compose.ui.text.input.TextFieldValue;
import app.chalo.premiumbus.data.models.app.PremiumPassengerDetailsAppModel;
import app.chalo.premiumbus.data.models.app.WomenAdjacencyPromiseState;
import app.chalo.premiumbus.data.models.entity.PremiumReserveTicketStatus;
import app.chalo.premiumbus.prebookedtickets.ui.newactivation.NewPremiumBusReserveTicketActivationContractKt;
import app.chalo.premiumbus.prebookedtickets.ui.newactivation.PBStopImageType;
import app.chalo.premiumbus.prebookedtickets.ui.newactivation.ticketinfohandler.PremiumBusPostBookingBottomSheetType;
import app.chalo.premiumbus.prebookedtickets.ui.newactivation.ticketinfohandler.PremiumReserveTicketPostBookingActionState;
import app.chalo.premiumbus.prebookedtickets.ui.newactivation.ticketinfohandler.PremiumReserveTicketTrackingState;
import app.chalo.premiumbus.ui.stopselection.PBStopSelectionScreenBottomSheetType;
import app.chalo.premiumbus.ui.stopselection.PremiumBusStopSelectionViewState;
import app.chalo.userprofile.Gender;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class zv0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20235a;

    public /* synthetic */ zv0(int i) {
        this.f20235a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f20235a) {
            case 0:
                PremiumBusStopSelectionViewState it = (PremiumBusStopSelectionViewState) obj;
                Intrinsics.i(it, "it");
                return PremiumBusStopSelectionViewState.a(it, null, false, false, null, null, null, null, false, null, false, false, null, null, 131069);
            case 1:
                PremiumBusStopSelectionViewState it2 = (PremiumBusStopSelectionViewState) obj;
                Intrinsics.i(it2, "it");
                return PremiumBusStopSelectionViewState.a(it2, null, true, false, null, null, null, null, false, null, false, false, null, null, 131037);
            case 2:
                PremiumBusStopSelectionViewState it3 = (PremiumBusStopSelectionViewState) obj;
                Intrinsics.i(it3, "it");
                return PremiumBusStopSelectionViewState.a(it3, null, false, false, null, null, null, null, false, null, false, false, null, null, 131037);
            case 3:
                PremiumBusStopSelectionViewState it4 = (PremiumBusStopSelectionViewState) obj;
                Intrinsics.i(it4, "it");
                return PremiumBusStopSelectionViewState.a(it4, null, false, false, null, null, null, null, false, null, false, false, null, null, 131037);
            case 4:
                PremiumBusStopSelectionViewState it5 = (PremiumBusStopSelectionViewState) obj;
                Intrinsics.i(it5, "it");
                return PremiumBusStopSelectionViewState.a(it5, null, true, false, null, null, null, null, false, null, false, false, null, null, 131069);
            case 5:
                PremiumBusStopSelectionViewState it6 = (PremiumBusStopSelectionViewState) obj;
                Intrinsics.i(it6, "it");
                return PremiumBusStopSelectionViewState.a(it6, null, false, false, null, null, null, null, false, null, false, false, null, null, 131069);
            case 6:
                return PremiumBusStopSelectionViewState.a((PremiumBusStopSelectionViewState) obj, null, false, false, null, null, null, null, false, null, false, false, null, null, 131037);
            case 7:
                return PremiumBusStopSelectionViewState.a((PremiumBusStopSelectionViewState) obj, null, false, false, null, null, null, null, false, null, false, false, null, null, 131037);
            case 8:
                return PremiumBusStopSelectionViewState.a((PremiumBusStopSelectionViewState) obj, null, false, false, null, null, PBStopSelectionScreenBottomSheetType.NoOriginDestinationPairsAvailable.f7959a, null, false, null, false, false, null, null, 131037);
            case 9:
                return PremiumBusStopSelectionViewState.a((PremiumBusStopSelectionViewState) obj, null, false, false, null, null, null, null, false, null, false, false, null, null, 131037);
            case 10:
                return PremiumBusStopSelectionViewState.a((PremiumBusStopSelectionViewState) obj, null, false, false, null, null, null, null, false, null, false, false, null, null, 131037);
            case 11:
                return PremiumBusStopSelectionViewState.a((PremiumBusStopSelectionViewState) obj, null, false, false, null, null, null, null, false, null, false, false, null, null, 131037);
            case 12:
                return PremiumBusStopSelectionViewState.a((PremiumBusStopSelectionViewState) obj, null, false, false, null, null, null, null, false, null, false, false, null, null, 81887);
            case 13:
                Intrinsics.i((TextFieldValue) obj, "it");
                return Unit.f17538a;
            case 14:
                PremiumPassengerDetailsAppModel it7 = (PremiumPassengerDetailsAppModel) obj;
                Intrinsics.i(it7, "it");
                return it7.c + " " + it7.b;
            case 15:
                PremiumReserveTicketPostBookingActionState it8 = (PremiumReserveTicketPostBookingActionState) obj;
                Intrinsics.i(it8, "it");
                return PremiumReserveTicketPostBookingActionState.a(it8, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, false, null, false, null, null, null, null, null, null, -32769, 31);
            case 16:
                PremiumReserveTicketPostBookingActionState it9 = (PremiumReserveTicketPostBookingActionState) obj;
                Intrinsics.i(it9, "it");
                return PremiumReserveTicketPostBookingActionState.a(it9, null, null, null, null, null, null, null, null, null, null, null, null, PremiumBusPostBookingBottomSheetType.Expired.f7421a, null, null, null, null, false, null, null, null, null, null, null, false, null, false, null, null, null, null, null, null, -32769, 31);
            case 17:
                PremiumReserveTicketPostBookingActionState it10 = (PremiumReserveTicketPostBookingActionState) obj;
                Intrinsics.i(it10, "it");
                return PremiumReserveTicketPostBookingActionState.a(it10, null, null, null, null, null, null, null, null, null, null, null, null, PremiumBusPostBookingBottomSheetType.ActivationCurrentlyNotAllowed.f7417a, null, null, null, null, false, null, null, null, null, null, null, false, null, false, null, null, null, null, null, null, -32769, 31);
            case 18:
                PremiumReserveTicketPostBookingActionState it11 = (PremiumReserveTicketPostBookingActionState) obj;
                Intrinsics.i(it11, "it");
                return PremiumReserveTicketPostBookingActionState.a(it11, null, null, null, null, null, null, null, null, null, null, null, null, PremiumBusPostBookingBottomSheetType.BleFeatureNotAvailable.f7418a, null, null, null, null, false, null, null, null, null, null, null, false, null, false, null, null, null, null, null, null, -32769, 31);
            case 19:
                PremiumReserveTicketPostBookingActionState it12 = (PremiumReserveTicketPostBookingActionState) obj;
                Intrinsics.i(it12, "it");
                WomenAdjacencyPromiseState womenAdjacencyPromiseState = it12.I;
                boolean z = womenAdjacencyPromiseState.f7129a;
                List seats = womenAdjacencyPromiseState.b;
                PremiumReserveTicketStatus premiumReserveTicketStatus = womenAdjacencyPromiseState.c;
                Gender userGender = womenAdjacencyPromiseState.d;
                boolean z2 = womenAdjacencyPromiseState.f;
                Intrinsics.i(seats, "seats");
                Intrinsics.i(userGender, "userGender");
                return PremiumReserveTicketPostBookingActionState.a(it12, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, false, null, false, null, null, null, null, new WomenAdjacencyPromiseState(z, seats, premiumReserveTicketStatus, userGender, true, z2), null, -1, 23);
            case 20:
                PremiumReserveTicketPostBookingActionState it13 = (PremiumReserveTicketPostBookingActionState) obj;
                Intrinsics.i(it13, "it");
                return PremiumReserveTicketPostBookingActionState.a(it13, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, false, null, false, null, null, null, null, null, null, -32769, 31);
            case 21:
                PremiumReserveTicketPostBookingActionState it14 = (PremiumReserveTicketPostBookingActionState) obj;
                Intrinsics.i(it14, "it");
                return PremiumReserveTicketPostBookingActionState.a(it14, null, null, null, null, null, null, null, null, null, null, null, null, null, PremiumReserveTicketTrackingState.EtaFetchStarted.f7476a, null, null, null, false, null, null, null, null, null, null, false, null, false, null, null, null, null, null, null, -65537, 31);
            case 22:
                PremiumReserveTicketPostBookingActionState it15 = (PremiumReserveTicketPostBookingActionState) obj;
                Intrinsics.i(it15, "it");
                return PremiumReserveTicketPostBookingActionState.a(it15, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, false, null, false, null, null, null, null, null, null, -4097, 31);
            case 23:
                PremiumReserveTicketPostBookingActionState it16 = (PremiumReserveTicketPostBookingActionState) obj;
                Intrinsics.i(it16, "it");
                return PremiumReserveTicketPostBookingActionState.a(it16, null, null, null, null, null, null, null, null, null, null, null, null, PremiumBusPostBookingBottomSheetType.FetchingTicketUpdateOptions.f7422a, null, null, null, null, false, null, null, null, null, null, null, false, null, false, null, null, null, null, null, null, -32769, 31);
            case 24:
                PremiumReserveTicketPostBookingActionState premiumReserveTicketPostBookingActionState = (PremiumReserveTicketPostBookingActionState) obj;
                List list = premiumReserveTicketPostBookingActionState.u;
                PBStopImageType.FetchFailed fetchFailed = PBStopImageType.FetchFailed.f7398a;
                return PremiumReserveTicketPostBookingActionState.a(premiumReserveTicketPostBookingActionState, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, NewPremiumBusReserveTicketActivationContractKt.a(list, fetchFailed), NewPremiumBusReserveTicketActivationContractKt.a(premiumReserveTicketPostBookingActionState.v, fetchFailed), null, null, null, null, false, null, false, null, null, null, null, null, null, -6291457, 31);
            case 25:
                PremiumReserveTicketPostBookingActionState premiumReserveTicketPostBookingActionState2 = (PremiumReserveTicketPostBookingActionState) obj;
                List list2 = premiumReserveTicketPostBookingActionState2.u;
                PBStopImageType.NoImagesAvailable noImagesAvailable = PBStopImageType.NoImagesAvailable.f7401a;
                return PremiumReserveTicketPostBookingActionState.a(premiumReserveTicketPostBookingActionState2, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, NewPremiumBusReserveTicketActivationContractKt.a(list2, noImagesAvailable), NewPremiumBusReserveTicketActivationContractKt.a(premiumReserveTicketPostBookingActionState2.v, noImagesAvailable), null, null, null, null, false, null, false, null, null, null, null, null, null, -6291457, 31);
            case 26:
                Function1 emit = (Function1) obj;
                Intrinsics.i(emit, "emit");
                emit.invoke("premium_reserve_ticket_ack_table");
                return Unit.f17538a;
            case 27:
                Function1 emit2 = (Function1) obj;
                Intrinsics.i(emit2, "emit");
                emit2.invoke("premium_reserve_ticket_ack_table");
                return Unit.f17538a;
            case 28:
                Function1 emit3 = (Function1) obj;
                Intrinsics.i(emit3, "emit");
                emit3.invoke("premium_reserve_ticket_receipt_table");
                return Unit.f17538a;
            default:
                Function1 emit4 = (Function1) obj;
                Intrinsics.i(emit4, "emit");
                emit4.invoke("premium_reserve_ticket_table");
                return Unit.f17538a;
        }
    }
}
