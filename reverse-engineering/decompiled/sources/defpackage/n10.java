package defpackage;

import androidx.compose.foundation.ImageKt;
import androidx.compose.material3.IconKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import app.cash.sqldelight.db.SqlPreparedStatement;
import app.chalo.home.data.exceptions.HomeRemoteDataException;
import app.chalo.instantticket.ui.faredetails.contract.FareDetailsBottomSheetType;
import app.chalo.instantticket.ui.faredetails.contract.FareDetailsViewState;
import app.chalo.instantticket.ui.instantticketscreen.InstantTicketWalletAccessState;
import app.chalo.juspay.JuspaySignatureRemoteException;
import app.chalo.kyc.min.ui.minkycdetails.MinKycDetailsDataState;
import app.chalo.livetracking.frameworklivetracking.data.error.LiveTrackingRemoteException;
import app.chalo.livetracking.universalsearch.data.exception.AutoCompleteRemoteDataException;
import app.chalo.login.ui.options.LoginOptionsDataState;
import app.chalo.login.ui.otp.LoginOtpEnterDataState;
import app.chalo.mticket.ui.tripinfo.MTicketTripInfoDataState;
import app.chalo.mticket.ui.tripinfo.MTicketTripInfoSnackBarType;
import app.chalo.multimodalticket.ui.GroupTicketLegSelectionDataState;
import app.chalo.multimodalticket.ui.GroupTicketPassengerSelectionDataState;
import app.chalo.ncmc.ui.entercarddetails.EnterCardDetailsViewState;
import app.chalo.network.model.GenericChaloErrorResponse;
import app.chalo.onboarding.languageselection.LanguageSelectionDataState;
import app.chalo.onboarding.languageselection.LanguageSelectionSnackbarType;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class n10 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18444a;
    public final /* synthetic */ String b;

    public /* synthetic */ n10(String str, int i) {
        this.f18444a = i;
        this.b = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        switch (this.f18444a) {
            case 0:
                EnterCardDetailsViewState it = (EnterCardDetailsViewState) obj;
                Intrinsics.i(it, "it");
                return EnterCardDetailsViewState.a(it, null, null, null, null, false, false, false, false, false, this.b, true, 1023);
            case 1:
                EnterCardDetailsViewState it2 = (EnterCardDetailsViewState) obj;
                Intrinsics.i(it2, "it");
                return EnterCardDetailsViewState.a(it2, null, null, this.b, null, false, false, false, false, false, null, false, 4087);
            case 2:
                return EnterCardDetailsViewState.a((EnterCardDetailsViewState) obj, null, null, null, this.b, false, false, false, false, false, null, false, 4047);
            case 3:
                FareDetailsViewState it3 = (FareDetailsViewState) obj;
                Intrinsics.i(it3, "it");
                return FareDetailsViewState.a(it3, null, null, null, false, false, false, null, null, null, false, false, null, false, null, null, false, null, null, null, null, false, false, null, null, null, false, null, false, null, null, this.b, null, null, null, -1, 29);
            case 4:
                FareDetailsViewState it4 = (FareDetailsViewState) obj;
                Intrinsics.i(it4, "it");
                return FareDetailsViewState.a(it4, null, null, null, false, false, false, null, null, null, false, false, null, false, null, null, false, null, new FareDetailsBottomSheetType.FareNoteSection(this.b), null, null, false, false, null, null, null, false, null, false, null, null, null, null, null, null, -262145, 31);
            case 5:
                return FareDetailsViewState.a((FareDetailsViewState) obj, null, null, null, false, false, false, null, null, null, false, false, null, false, null, null, false, null, null, null, null, false, false, null, null, null, false, null, false, null, null, null, null, null, this.b, -1, 15);
            case 6:
                return FareDetailsViewState.a((FareDetailsViewState) obj, null, null, null, false, false, false, null, null, null, false, false, null, false, null, null, false, null, null, null, null, false, false, null, null, null, false, null, false, null, null, this.b, null, null, null, -1, 29);
            case 7:
                GroupTicketLegSelectionDataState dataState = (GroupTicketLegSelectionDataState) obj;
                Intrinsics.i(dataState, "dataState");
                Map map = dataState.f;
                if (map.isEmpty()) {
                    return dataState;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(MapsKt.g(map.size()));
                for (Map.Entry entry : map.entrySet()) {
                    Object key = entry.getKey();
                    String str6 = (String) entry.getKey();
                    GroupTicketPassengerSelectionDataState groupTicketPassengerSelectionDataState = (GroupTicketPassengerSelectionDataState) entry.getValue();
                    linkedHashMap.put(key, Intrinsics.d(str6, this.b) ? GroupTicketPassengerSelectionDataState.a(groupTicketPassengerSelectionDataState, true, 0, false, false, 29) : GroupTicketPassengerSelectionDataState.a(groupTicketPassengerSelectionDataState, false, 0, false, false, 29));
                }
                return GroupTicketLegSelectionDataState.a(dataState, null, false, null, null, null, linkedHashMap, 0, null, 223);
            case 8:
                GenericChaloErrorResponse genericChaloErrorResponse = (GenericChaloErrorResponse) obj;
                if (genericChaloErrorResponse == null || (str = genericChaloErrorResponse.b) == null) {
                    str = this.b;
                }
                return new HomeRemoteDataException(genericChaloErrorResponse, str);
            case 9:
                GenericChaloErrorResponse genericChaloErrorResponse2 = (GenericChaloErrorResponse) obj;
                if (genericChaloErrorResponse2 == null || (str2 = genericChaloErrorResponse2.b) == null) {
                    str2 = this.b;
                }
                return new HomeRemoteDataException(genericChaloErrorResponse2, str2);
            case 10:
                return IconKt.Icon_ww6aTOc$lambda$5$lambda$4(this.b, (SemanticsPropertyReceiver) obj);
            case 11:
                return ImageKt.Image$lambda$0$0(this.b, (SemanticsPropertyReceiver) obj);
            case 12:
                GenericChaloErrorResponse genericChaloErrorResponse3 = (GenericChaloErrorResponse) obj;
                if (genericChaloErrorResponse3 == null || (str3 = genericChaloErrorResponse3.b) == null) {
                    str3 = this.b;
                }
                return new AutoCompleteRemoteDataException(genericChaloErrorResponse3, str3);
            case 13:
                return InstantTicketWalletAccessState.a((InstantTicketWalletAccessState) obj, null, false, false, null, null, false, null, this.b, false, false, null, false, false, 8063);
            case 14:
                return InstantTicketWalletAccessState.a((InstantTicketWalletAccessState) obj, null, false, false, null, null, false, null, null, false, false, this.b, false, false, 7167);
            case 15:
                GenericChaloErrorResponse genericChaloErrorResponse4 = (GenericChaloErrorResponse) obj;
                if (genericChaloErrorResponse4 == null || (str4 = genericChaloErrorResponse4.b) == null) {
                    str4 = this.b;
                }
                return new JuspaySignatureRemoteException(genericChaloErrorResponse4, str4);
            case 16:
                SqlPreparedStatement execute = (SqlPreparedStatement) obj;
                Intrinsics.i(execute, "$this$execute");
                execute.bindString(0, this.b);
                return Unit.f17538a;
            case 17:
                LanguageSelectionDataState it5 = (LanguageSelectionDataState) obj;
                Intrinsics.i(it5, "it");
                return LanguageSelectionDataState.a(it5, false, new LanguageSelectionSnackbarType.HomeScreenConfigFetchFailed(this.b), false, false, null, null, null, null, 253);
            case 18:
                return LanguageSelectionDataState.a((LanguageSelectionDataState) obj, false, new LanguageSelectionSnackbarType.ChaloConfigFetchFailed(this.b), false, false, null, null, null, null, 253);
            case 19:
                GenericChaloErrorResponse genericChaloErrorResponse5 = (GenericChaloErrorResponse) obj;
                if (genericChaloErrorResponse5 == null || (str5 = genericChaloErrorResponse5.b) == null) {
                    str5 = this.b;
                }
                return new LiveTrackingRemoteException(genericChaloErrorResponse5, str5);
            case 20:
                SqlPreparedStatement execute2 = (SqlPreparedStatement) obj;
                Intrinsics.i(execute2, "$this$execute");
                execute2.bindString(0, this.b);
                return Unit.f17538a;
            case 21:
                LoginOptionsDataState it6 = (LoginOptionsDataState) obj;
                Intrinsics.i(it6, "it");
                return LoginOptionsDataState.a(it6, this.b, null, null, false, null, true, null, null, null, null, false, false, 32730);
            case 22:
                LoginOptionsDataState it7 = (LoginOptionsDataState) obj;
                Intrinsics.i(it7, "it");
                return LoginOptionsDataState.a(it7, this.b, null, null, false, null, false, null, null, null, null, false, false, 32730);
            case 23:
                LoginOptionsDataState it8 = (LoginOptionsDataState) obj;
                Intrinsics.i(it8, "it");
                return LoginOptionsDataState.a(it8, this.b, null, null, false, null, false, null, null, null, null, false, false, 32730);
            case 24:
                LoginOptionsDataState it9 = (LoginOptionsDataState) obj;
                Intrinsics.i(it9, "it");
                return LoginOptionsDataState.a(it9, this.b, null, null, false, null, false, null, null, null, null, false, false, 32766);
            case 25:
                LoginOtpEnterDataState it10 = (LoginOtpEnterDataState) obj;
                Intrinsics.i(it10, "it");
                return LoginOtpEnterDataState.a(it10, this.b, false, null, false, 0L, false, null, null, null, null, 2046);
            case 26:
                MTicketTripInfoDataState it11 = (MTicketTripInfoDataState) obj;
                Intrinsics.i(it11, "it");
                return MTicketTripInfoDataState.a(it11, null, null, null, null, new MTicketTripInfoSnackBarType.ProductFetchFailed(this.b), false, null, null, null, 1007);
            case 27:
                SqlPreparedStatement execute3 = (SqlPreparedStatement) obj;
                Intrinsics.i(execute3, "$this$execute");
                execute3.bindString(0, this.b);
                return Unit.f17538a;
            case 28:
                MinKycDetailsDataState minKycDetailsDataState = (MinKycDetailsDataState) obj;
                String str7 = this.b;
                return MinKycDetailsDataState.a(minKycDetailsDataState, null, false, true, false, str7 == null || str7.length() == 0, 11);
            default:
                MinKycDetailsDataState minKycDetailsDataState2 = (MinKycDetailsDataState) obj;
                String str8 = this.b;
                if (str8 == null) {
                    str8 = "";
                }
                return MinKycDetailsDataState.a(minKycDetailsDataState2, str8, true, false, false, false, 8);
        }
    }
}
