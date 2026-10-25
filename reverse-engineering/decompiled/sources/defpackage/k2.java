package defpackage;

import android.widget.ImageView;
import androidx.compose.foundation.BasicTooltipKt;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.material3.BottomSheetDefaults;
import androidx.compose.material3.DatePickerDefaults;
import androidx.compose.material3.DatePickerKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.media3.extractor.metadata.dvbsi.AppInfoTableDecoder;
import app.cash.sqldelight.db.SqlPreparedStatement;
import app.chalo.checkout.data.exceptions.ChaloPayPaymentFailedException;
import app.chalo.checkout.data.exceptions.ChaloPaymentOrderCreationFailedException;
import app.chalo.checkout.data.exceptions.CheckoutRemoteDataException;
import app.chalo.checkout.ui.screen.card.CheckoutCardDataState;
import app.chalo.checkout.ui.screen.checkout.customurl.CustomUrlCheckoutDataState;
import app.chalo.checkout.ui.screen.postpayment.PostPaymentDataState;
import app.chalo.checkout.ui.screen.postpayment.PostPaymentSuccessProductType;
import app.chalo.checkout.ui.screen.postpayment.PostPaymentSuccessScreenDetail;
import app.chalo.electricitybill.ui.paymenthistory.ElectricityPaymentHistoryDataState;
import app.chalo.home.ui.chalobusrouteinfo.ChaloBusRouteInfoDataState;
import app.chalo.home.ui.chalobusrouteinfo.ChaloBusRouteInfoErrorType;
import app.chalo.ncmc.ui.landing.CardInfoLandingScreenBottomSheetType;
import app.chalo.ncmc.ui.landing.ChaloCardInfoViewState;
import app.chalo.ncmc.ui.transactionhistory.CardTransactionHistoryViewState;
import app.chalo.network.model.GenericChaloErrorResponse;
import app.chalo.onboarding.citydiscontinued.CityDiscontinuedDataState;
import app.chalo.onboarding.citylocationselection.ui.CityLocationSelectionState;
import app.chalo.onboarding.cityselection.ui.CitySelectionDataState;
import app.chalo.premiumbus.data.models.app.PremiumReserveTicketAppModel;
import app.chalo.providers.lottieassetprovider.LottieType;
import app.chalo.validationsdk.blevalidation.ui.BleValidationState;
import coil.Coil;
import coil.ImageLoader;
import coil.request.ImageRequest;
import coil.target.ImageViewTarget;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.ws.WebSocketProtocol;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class k2 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17457a;
    public final /* synthetic */ String b;

    public /* synthetic */ k2(String str, int i) {
        this.f17457a = i;
        this.b = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        switch (this.f17457a) {
            case 0:
                ImageView iconView = (ImageView) obj;
                Intrinsics.i(iconView, "iconView");
                String str8 = this.b;
                if (str8 != null) {
                    ImageLoader imageLoaderA = Coil.a(iconView.getContext());
                    ImageRequest.Builder builder = new ImageRequest.Builder(iconView.getContext());
                    builder.c = str8;
                    builder.d = new ImageViewTarget(iconView);
                    builder.k = null;
                    builder.l = null;
                    builder.m = null;
                    imageLoaderA.a(builder.a());
                }
                return Unit.f17538a;
            case 1:
                PremiumReserveTicketAppModel it = (PremiumReserveTicketAppModel) obj;
                Intrinsics.i(it, "it");
                return Boolean.valueOf(Intrinsics.d(it.f7113a.g, this.b));
            case 2:
                return BasicTooltipKt.TooltipPopup$lambda$1$0$0(this.b, (SemanticsPropertyReceiver) obj);
            case 3:
                BleValidationState currentState = (BleValidationState) obj;
                Intrinsics.i(currentState, "currentState");
                ArrayList arrayListE0 = CollectionsKt.E0(currentState.i);
                arrayListE0.add(this.b);
                return BleValidationState.a(currentState, null, null, null, null, null, false, null, false, arrayListE0, null, 3839);
            case 4:
                return BottomSheetDefaults.DragHandle_lgZ2HuY$lambda$1$lambda$0(this.b, (SemanticsPropertyReceiver) obj);
            case 5:
                return CanvasKt.Canvas$lambda$1$0(this.b, (SemanticsPropertyReceiver) obj);
            case 6:
                CardTransactionHistoryViewState it2 = (CardTransactionHistoryViewState) obj;
                Intrinsics.i(it2, "it");
                return CardTransactionHistoryViewState.a(it2, null, null, null, false, this.b, 15);
            case 7:
                ChaloBusRouteInfoDataState it3 = (ChaloBusRouteInfoDataState) obj;
                Intrinsics.i(it3, "it");
                EmptyList emptyList = EmptyList.f17557a;
                return ChaloBusRouteInfoDataState.a(it3, null, false, emptyList, null, emptyList, emptyList, null, new ChaloBusRouteInfoErrorType.ApiError(this.b), null, 257);
            case 8:
                ChaloBusRouteInfoDataState it4 = (ChaloBusRouteInfoDataState) obj;
                Intrinsics.i(it4, "it");
                return ChaloBusRouteInfoDataState.a(it4, null, false, null, null, null, null, this.b, null, null, 447);
            case 9:
                return ChaloBusRouteInfoDataState.a((ChaloBusRouteInfoDataState) obj, this.b, true, null, null, null, null, null, null, null, 380);
            case 10:
                return ChaloCardInfoViewState.a((ChaloCardInfoViewState) obj, null, null, false, 0, null, null, null, null, null, null, false, null, null, null, null, false, null, false, null, false, new CardInfoLandingScreenBottomSheetType.CardLinking(this.b), false, 6291455);
            case 11:
                SqlPreparedStatement execute = (SqlPreparedStatement) obj;
                Intrinsics.i(execute, "$this$execute");
                execute.bindString(0, this.b);
                return Unit.f17538a;
            case 12:
                return CheckoutCardDataState.a((CheckoutCardDataState) obj, this.b, null, null, null, null, null, null, WebSocketProtocol.PAYLOAD_SHORT);
            case 13:
                return PostPaymentDataState.a((PostPaymentDataState) obj, false, new PostPaymentSuccessScreenDetail(PostPaymentSuccessProductType.OtherProduct.f1588a, this.b, null, LottieType.PAYMENT_SUCCESS, 244), null, 4);
            case 14:
                GenericChaloErrorResponse genericChaloErrorResponse = (GenericChaloErrorResponse) obj;
                if (genericChaloErrorResponse == null || (str = genericChaloErrorResponse.b) == null) {
                    str = this.b;
                }
                return new ChaloPayPaymentFailedException(genericChaloErrorResponse, str);
            case 15:
                GenericChaloErrorResponse genericChaloErrorResponse2 = (GenericChaloErrorResponse) obj;
                if (genericChaloErrorResponse2 == null || (str2 = genericChaloErrorResponse2.b) == null) {
                    str2 = this.b;
                }
                return new CheckoutRemoteDataException(genericChaloErrorResponse2, str2);
            case 16:
                GenericChaloErrorResponse genericChaloErrorResponse3 = (GenericChaloErrorResponse) obj;
                if (genericChaloErrorResponse3 == null || (str3 = genericChaloErrorResponse3.b) == null) {
                    str3 = this.b;
                }
                return new CheckoutRemoteDataException(genericChaloErrorResponse3, str3);
            case 17:
                GenericChaloErrorResponse genericChaloErrorResponse4 = (GenericChaloErrorResponse) obj;
                if (genericChaloErrorResponse4 == null || (str4 = genericChaloErrorResponse4.b) == null) {
                    str4 = this.b;
                }
                return new ChaloPayPaymentFailedException(genericChaloErrorResponse4, str4);
            case 18:
                GenericChaloErrorResponse genericChaloErrorResponse5 = (GenericChaloErrorResponse) obj;
                if (genericChaloErrorResponse5 == null || (str5 = genericChaloErrorResponse5.b) == null) {
                    str5 = this.b;
                }
                return new CheckoutRemoteDataException(genericChaloErrorResponse5, str5);
            case 19:
                GenericChaloErrorResponse genericChaloErrorResponse6 = (GenericChaloErrorResponse) obj;
                if (genericChaloErrorResponse6 == null || (str6 = genericChaloErrorResponse6.b) == null) {
                    str6 = this.b;
                }
                return new ChaloPaymentOrderCreationFailedException(genericChaloErrorResponse6, str6);
            case 20:
                GenericChaloErrorResponse genericChaloErrorResponse7 = (GenericChaloErrorResponse) obj;
                if (genericChaloErrorResponse7 == null || (str7 = genericChaloErrorResponse7.b) == null) {
                    str7 = this.b;
                }
                return new CheckoutRemoteDataException(genericChaloErrorResponse7, str7);
            case 21:
                Intrinsics.i((CityDiscontinuedDataState) obj, "it");
                return new CityDiscontinuedDataState(this.b);
            case 22:
                CityLocationSelectionState it5 = (CityLocationSelectionState) obj;
                Intrinsics.i(it5, "it");
                return CityLocationSelectionState.a(it5, false, null, null, null, this.b, null, null, false, null, false, 2031);
            case 23:
                CitySelectionDataState it6 = (CitySelectionDataState) obj;
                Intrinsics.i(it6, "it");
                return CitySelectionDataState.a(it6, null, null, this.b, null, false, false, false, 123);
            case 24:
                SqlPreparedStatement execute2 = (SqlPreparedStatement) obj;
                Intrinsics.i(execute2, "$this$execute");
                execute2.bindString(0, this.b);
                return Unit.f17538a;
            case 25:
                CustomUrlCheckoutDataState it7 = (CustomUrlCheckoutDataState) obj;
                Intrinsics.i(it7, "it");
                return CustomUrlCheckoutDataState.a(it7, true, this.b, 0, false, AppInfoTableDecoder.APPLICATION_INFORMATION_TABLE_ID);
            case 26:
                return DatePickerDefaults.DatePickerHeadline_ISIPfiY$lambda$3$lambda$2(this.b, (SemanticsPropertyReceiver) obj);
            case 27:
                return DatePickerKt.Day$lambda$61$lambda$60(this.b, (SemanticsPropertyReceiver) obj);
            case 28:
                return DatePickerKt.Year$lambda$66$lambda$65(this.b, (SemanticsPropertyReceiver) obj);
            default:
                return ElectricityPaymentHistoryDataState.a((ElectricityPaymentHistoryDataState) obj, false, null, null, this.b, false, 23);
        }
    }
}
