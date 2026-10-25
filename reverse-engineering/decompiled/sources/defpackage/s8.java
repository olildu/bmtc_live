package defpackage;

import androidx.compose.material3.SelectableDates;
import androidx.compose.material3.internal.CalendarModelKt;
import app.chalo.core.Routes_tableQueries;
import app.chalo.core.database.dao.RouteDaoImpl;
import app.chalo.livetracking.stoptripplannerresult.StopTripPlannerResultsDataState;
import app.chalo.livetracking.stoptripplannerresult.StopTripPlannerResultsectionType;
import app.chalo.ncmc.ui.cardrechargeamount.CardRechargeAmountErrorType;
import app.chalo.ncmc.ui.cardrechargeamount.ChaloCardRechargeAmountViewState;
import app.chalo.premiumbus.bulkbookingridedetails.ui.PbBulkBookingRideDetailsComponent;
import app.chalo.premiumbus.bulkbookingridedetails.ui.PbBulkBookingRideDetailsDialogType;
import app.chalo.premiumbus.bulkbookingridedetails.ui.PbBulkBookingRideDetailsViewIntent;
import app.chalo.premiumbus.bulkbookingridedetails.ui.PbBulkBookingRideDetailsViewState;
import app.chalo.premiumbus.data.models.app.PremiumReserveTicketAppModel;
import app.chalo.premiumbus.data.models.app.PremiumReserveTripAppModel;
import app.chalo.productpurchase.passpurchase.ui.enteruserdetails.SuperPassEnterUserDetailsDataState;
import app.chalo.productpurchase.passpurchase.ui.enteruserdetails.SuperPassEnterUserDetailsIntent;
import app.chalo.productpurchase.passpurchase.ui.enteruserdetails.SuperPassEnterUserDetailsViewModel;
import app.chalo.ridefeedback.domain.BackfillPendingPremiumBusPrfUseCase;
import app.chalo.scenes.args.SuperPassBasicUserPurpose;
import app.chalo.usecase.ChaloCustomDateFormat;
import app.chalo.usecase.FeedbackData;
import app.chalo.usecase.FormatTimeInMillisToGivenFormatUseCase;
import app.chalo.userprofile.Gender;
import app.chalo.userprofile.ui.UserProfileFormDataState;
import app.chalo.userprofile.ui.UserProfileFormDialogType;
import app.chalo.userprofile.ui.minprofileupdate.MinProfileUpdateDataState;
import app.chalo.userprofile.ui.minprofileupdate.MinProfileUpdateDialogType;
import app.chalo.validationsdk.blevalidation.ui.BleValidationBottomsheetInfo;
import app.chalo.validationsdk.blevalidation.ui.BleValidationBottomsheetType;
import app.chalo.validationsdk.blevalidation.ui.BleValidationFragmentComponentAndroid;
import app.chalo.validationsdk.blevalidation.ui.BleValidationState;
import app.chalo.validationsdk.blevalidation.ui.RideRatingBottomsheetInfo;
import java.io.IOException;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class s8 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19279a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ s8(long j, Serializable serializable, Object obj, int i) {
        this.f19279a = i;
        this.b = j;
        this.c = serializable;
        this.d = obj;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00ac  */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) throws IOException {
        BleValidationBottomsheetInfo bleValidationBottomsheetInfo;
        Pair pair;
        boolean z;
        switch (this.f19279a) {
            case 0:
                BackfillPendingPremiumBusPrfUseCase backfillPendingPremiumBusPrfUseCase = (BackfillPendingPremiumBusPrfUseCase) this.c;
                LinkedHashMap linkedHashMap = (LinkedHashMap) this.d;
                PremiumReserveTicketAppModel ticket = (PremiumReserveTicketAppModel) obj;
                Intrinsics.i(ticket, "ticket");
                PremiumReserveTripAppModel premiumReserveTripAppModel = (PremiumReserveTripAppModel) linkedHashMap.get(ticket.f7113a.f7114a);
                backfillPendingPremiumBusPrfUseCase.getClass();
                long jD = BackfillPendingPremiumBusPrfUseCase.d(ticket, premiumReserveTripAppModel);
                return Boolean.valueOf(jD > 0 && this.b - jD < CalendarModelKt.MillisecondsIn24Hours);
            case 1:
                BleValidationFragmentComponentAndroid bleValidationFragmentComponentAndroid = (BleValidationFragmentComponentAndroid) this.c;
                List list = (List) this.d;
                BleValidationState currentState = (BleValidationState) obj;
                Intrinsics.i(currentState, "currentState");
                BleValidationBottomsheetType bleValidationBottomsheetType = BleValidationBottomsheetType.RIDE_FEEDBACK_BOTTOMSHEET;
                BleValidationBottomsheetInfo bleValidationBottomsheetInfo2 = currentState.e;
                Object next = null;
                if (bleValidationBottomsheetInfo2 != null) {
                    bleValidationFragmentComponentAndroid.getClass();
                    Iterator it = list.iterator();
                    if (it.hasNext()) {
                        next = it.next();
                        if (it.hasNext()) {
                            int iIntValue = ((Number) ((FeedbackData) next).f10169a.e()).intValue();
                            do {
                                Object next2 = it.next();
                                int iIntValue2 = ((Number) ((FeedbackData) next2).f10169a.e()).intValue();
                                if (iIntValue < iIntValue2) {
                                    next = next2;
                                    iIntValue = iIntValue2;
                                }
                            } while (it.hasNext());
                        }
                    }
                    FeedbackData feedbackData = (FeedbackData) next;
                    bleValidationBottomsheetInfo = new BleValidationBottomsheetInfo(bleValidationBottomsheetInfo2.f10567a, bleValidationBottomsheetInfo2.b, bleValidationBottomsheetInfo2.c, new RideRatingBottomsheetInfo(list, (feedbackData == null || (pair = feedbackData.f10169a) == null) ? 5 : ((Number) pair.e()).intValue(), this.b));
                } else {
                    bleValidationBottomsheetInfo = null;
                }
                return BleValidationState.a(currentState, null, null, null, bleValidationBottomsheetType, bleValidationBottomsheetInfo, false, null, false, null, null, 4071);
            case 2:
                Ref.LongRef longRef = (Ref.LongRef) this.c;
                WritableByteChannel writableByteChannel = (WritableByteChannel) this.d;
                ByteBuffer bb = (ByteBuffer) obj;
                Intrinsics.i(bb, "bb");
                long j = this.b - longRef.element;
                if (j < bb.remaining()) {
                    int iLimit = bb.limit();
                    bb.limit(bb.position() + ((int) j));
                    while (bb.hasRemaining()) {
                        writableByteChannel.write(bb);
                    }
                    bb.limit(iLimit);
                    longRef.element += j;
                } else {
                    long jWrite = 0;
                    while (bb.hasRemaining()) {
                        jWrite += (long) writableByteChannel.write(bb);
                    }
                    longRef.element += jWrite;
                }
                return Unit.f17538a;
            case 3:
                String str = (String) this.c;
                CardRechargeAmountErrorType cardRechargeAmountErrorType = (CardRechargeAmountErrorType) this.d;
                ChaloCardRechargeAmountViewState it2 = (ChaloCardRechargeAmountViewState) obj;
                Intrinsics.i(it2, "it");
                return ChaloCardRechargeAmountViewState.a(it2, null, null, null, null, null, this.b, str, null, null, cardRechargeAmountErrorType, false, false, null, null, null, null, null, false, null, 2093887);
            case 4:
                Long l = (Long) this.c;
                return MinProfileUpdateDataState.a((MinProfileUpdateDataState) obj, null, null, null, 0, false, null, null, new MinProfileUpdateDialogType.DobPicker((SelectableDates) this.d, l != null ? l.longValue() : this.b), 127);
            case 5:
                PbBulkBookingRideDetailsComponent pbBulkBookingRideDetailsComponent = (PbBulkBookingRideDetailsComponent) this.c;
                PbBulkBookingRideDetailsViewIntent.DateSelectedIntent dateSelectedIntent = (PbBulkBookingRideDetailsViewIntent.DateSelectedIntent) this.d;
                FormatTimeInMillisToGivenFormatUseCase formatTimeInMillisToGivenFormatUseCase = pbBulkBookingRideDetailsComponent.p;
                long jLongValue = dateSelectedIntent.f6918a.longValue();
                ChaloCustomDateFormat chaloCustomDateFormat = ChaloCustomDateFormat.DAY_WITH_MONTH_YEAR_ABBREVIATED_FORMAT;
                return PbBulkBookingRideDetailsViewState.a((PbBulkBookingRideDetailsViewState) obj, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, false, null, new PbBulkBookingRideDetailsDialogType.PassDateChangeConfirmationDialog(FormatTimeInMillisToGivenFormatUseCase.a(formatTimeInMillisToGivenFormatUseCase, jLongValue, chaloCustomDateFormat, 12), FormatTimeInMillisToGivenFormatUseCase.a(pbBulkBookingRideDetailsComponent.p, this.b, chaloCustomDateFormat, 12), dateSelectedIntent.f6918a.longValue()), null, null, false, null, false, 66060287);
            case 6:
                RouteDaoImpl routeDaoImpl = (RouteDaoImpl) this.c;
                String str2 = (String) this.d;
                Routes_tableQueries routes_tableQueries = routeDaoImpl.f2079a;
                long j2 = this.b;
                routes_tableQueries.W(j2, str2);
                routeDaoImpl.f2079a.X(j2, str2);
                return Unit.f17538a;
            case 7:
                Map map = (Map) this.c;
                Map map2 = (Map) this.d;
                StopTripPlannerResultsDataState it3 = (StopTripPlannerResultsDataState) obj;
                Intrinsics.i(it3, "it");
                return StopTripPlannerResultsDataState.a(it3, null, null, null, null, map, null, map2, StopTripPlannerResultsectionType.RESULT, null, null, null, false, null, false, Long.valueOf(this.b), false, null, 327471);
            case 8:
                SuperPassEnterUserDetailsIntent.FieldUpdatedIntent fieldUpdatedIntent = (SuperPassEnterUserDetailsIntent.FieldUpdatedIntent) this.c;
                SuperPassEnterUserDetailsViewModel superPassEnterUserDetailsViewModel = (SuperPassEnterUserDetailsViewModel) this.d;
                SuperPassEnterUserDetailsDataState superPassEnterUserDetailsDataState = (SuperPassEnterUserDetailsDataState) obj;
                String str3 = fieldUpdatedIntent.f8416a;
                Gender gender = fieldUpdatedIntent.b;
                Long l2 = fieldUpdatedIntent.c;
                long j3 = this.b;
                Long lValueOf = Long.valueOf(j3);
                SuperPassBasicUserPurpose superPassBasicUserPurpose = superPassEnterUserDetailsDataState.f;
                String str4 = fieldUpdatedIntent.f8416a;
                Gender gender2 = fieldUpdatedIntent.b;
                Long l3 = fieldUpdatedIntent.c;
                superPassEnterUserDetailsViewModel.getClass();
                int i = superPassBasicUserPurpose == null ? -1 : SuperPassEnterUserDetailsViewModel.WhenMappings.f8428a[superPassBasicUserPurpose.ordinal()];
                if (i != -1) {
                    z = true;
                    if (i != 1) {
                        if (i != 2 && i != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        if (StringsKt.u0(str4).toString().length() <= 0) {
                            z = false;
                        }
                    } else if (StringsKt.u0(str4).toString().length() <= 0 || j3 == -1 || l3 == null || l3.longValue() == -1 || gender2 == null || gender2 == Gender.NULL) {
                        z = false;
                    }
                } else {
                    z = false;
                }
                return SuperPassEnterUserDetailsDataState.a(superPassEnterUserDetailsDataState, str3, gender, l2, lValueOf, z, null, null, 32);
            default:
                UserProfileFormDataState userProfileFormDataState = (UserProfileFormDataState) this.c;
                SelectableDates selectableDates = (SelectableDates) this.d;
                UserProfileFormDataState userProfileFormDataState2 = (UserProfileFormDataState) obj;
                Long l4 = userProfileFormDataState.e;
                return UserProfileFormDataState.a(userProfileFormDataState2, null, null, null, null, null, null, null, null, false, new UserProfileFormDialogType.DobPicker(selectableDates, l4 != null ? l4.longValue() : this.b), null, 12287);
        }
    }

    public /* synthetic */ s8(Object obj, long j, Object obj2, int i) {
        this.f19279a = i;
        this.c = obj;
        this.b = j;
        this.d = obj2;
    }

    public /* synthetic */ s8(Object obj, Object obj2, long j, int i) {
        this.f19279a = i;
        this.c = obj;
        this.d = obj2;
        this.b = j;
    }
}
