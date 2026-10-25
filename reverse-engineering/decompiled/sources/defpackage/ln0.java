package defpackage;

import androidx.compose.animation.AnimatedContentTransitionScope;
import app.chalo.compose.utils.ContentAnimationTransitionSpecKt;
import app.chalo.instantticket.data.exception.ProductBookingRemoteDataException;
import app.chalo.ncmc.ui.ncmcofflinerecharge.OfflineCardRechargeViewState;
import app.chalo.ncmc.ui.ncmcofflinerecharge.OfflineRechargeScreenType;
import app.chalo.ncmc.ui.ncmcofflinerecharge.compose.OfflineCardRechargeScreenKt;
import app.chalo.network.model.GenericChaloErrorResponse;
import app.chalo.ondc.error.MetroLineStopListFetchFailedException;
import app.chalo.ondc.remote.OndcTicketReceiptFetchFailedException;
import app.chalo.productbooking.common.data.exception.MobileTicketProductFetchFailedException;
import app.chalo.productbooking.routeselection.data.exception.AvailableRoutesFetchFailedException;
import io.ktor.client.engine.okhttp.OkHttpEngine;
import kotlin.Lazy;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.OkHttpClient;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class ln0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18329a;

    public /* synthetic */ ln0(int i) {
        this.f18329a = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.f18329a;
        Unit unit = Unit.f17538a;
        switch (i) {
            case 0:
                OfflineCardRechargeViewState it = (OfflineCardRechargeViewState) obj;
                Intrinsics.i(it, "it");
                return OfflineCardRechargeViewState.a(it, null, null, null, null, null, null, null, null, null, false, false, true, false, null, null, false, false, null, 2095103);
            case 1:
                OfflineCardRechargeViewState it2 = (OfflineCardRechargeViewState) obj;
                Intrinsics.i(it2, "it");
                return OfflineCardRechargeViewState.a(it2, OfflineRechargeScreenType.SUCCESS, null, null, null, null, null, null, null, null, false, false, false, false, null, null, false, false, null, 524286);
            case 2:
                OfflineCardRechargeViewState it3 = (OfflineCardRechargeViewState) obj;
                Intrinsics.i(it3, "it");
                return OfflineCardRechargeViewState.a(it3, null, null, null, null, null, null, null, null, null, false, false, false, false, null, null, false, false, null, 1572863);
            case 3:
                OfflineCardRechargeViewState it4 = (OfflineCardRechargeViewState) obj;
                Intrinsics.i(it4, "it");
                return OfflineCardRechargeViewState.a(it4, null, null, null, null, null, null, null, null, null, false, false, false, false, null, null, false, false, null, 2096639);
            case 4:
                return OfflineCardRechargeViewState.a((OfflineCardRechargeViewState) obj, null, null, null, null, null, null, null, null, null, true, false, false, false, null, null, false, false, null, 2096639);
            case 5:
                return OfflineCardRechargeViewState.a((OfflineCardRechargeViewState) obj, null, null, null, null, null, null, null, null, null, false, false, false, false, null, null, false, false, null, 2096639);
            case 6:
                return OfflineCardRechargeViewState.a((OfflineCardRechargeViewState) obj, null, null, null, null, null, null, null, null, null, false, false, false, false, null, null, false, false, null, 2096639);
            case 7:
                return OfflineCardRechargeViewState.a((OfflineCardRechargeViewState) obj, null, null, null, null, null, null, null, null, null, false, false, false, false, null, null, false, false, null, 1966079);
            case 8:
                AnimatedContentTransitionScope AnimatedContent = (AnimatedContentTransitionScope) obj;
                Intrinsics.i(AnimatedContent, "$this$AnimatedContent");
                int i2 = OfflineCardRechargeScreenKt.WhenMappings.f6402a[((OfflineRechargeScreenType) AnimatedContent.getTargetState()).ordinal()];
                if (i2 == 1) {
                    return ContentAnimationTransitionSpecKt.a(AnimatedContent);
                }
                if (i2 == 2) {
                    return ContentAnimationTransitionSpecKt.b(AnimatedContent);
                }
                throw new NoWhenBranchMatchedException();
            case 9:
                OkHttpClient.Builder builder = (OkHttpClient.Builder) obj;
                Intrinsics.i(builder, "<this>");
                builder.followRedirects(false);
                builder.followSslRedirects(false);
                builder.retryOnConnectionFailure(true);
                return unit;
            case 10:
                Lazy lazy = OkHttpEngine.i;
                Intrinsics.i((OkHttpClient) obj, "it");
                return unit;
            case 11:
                GenericChaloErrorResponse genericChaloErrorResponse = (GenericChaloErrorResponse) obj;
                return new ProductBookingRemoteDataException(genericChaloErrorResponse, genericChaloErrorResponse != null ? genericChaloErrorResponse.b : null);
            case 12:
                GenericChaloErrorResponse genericChaloErrorResponse2 = (GenericChaloErrorResponse) obj;
                return new ProductBookingRemoteDataException(genericChaloErrorResponse2, genericChaloErrorResponse2 != null ? genericChaloErrorResponse2.b : null);
            case 13:
                GenericChaloErrorResponse genericChaloErrorResponse3 = (GenericChaloErrorResponse) obj;
                return new ProductBookingRemoteDataException(genericChaloErrorResponse3, genericChaloErrorResponse3 != null ? genericChaloErrorResponse3.b : null);
            case 14:
                GenericChaloErrorResponse genericChaloErrorResponse4 = (GenericChaloErrorResponse) obj;
                return new MobileTicketProductFetchFailedException(genericChaloErrorResponse4, genericChaloErrorResponse4 != null ? genericChaloErrorResponse4.b : null);
            case 15:
                GenericChaloErrorResponse genericChaloErrorResponse5 = (GenericChaloErrorResponse) obj;
                return new AvailableRoutesFetchFailedException(genericChaloErrorResponse5 != null ? genericChaloErrorResponse5.b : null);
            case 16:
                GenericChaloErrorResponse genericChaloErrorResponse6 = (GenericChaloErrorResponse) obj;
                return new MobileTicketProductFetchFailedException(genericChaloErrorResponse6, genericChaloErrorResponse6 != null ? genericChaloErrorResponse6.b : null);
            case 17:
                GenericChaloErrorResponse genericChaloErrorResponse7 = (GenericChaloErrorResponse) obj;
                return new ProductBookingRemoteDataException(genericChaloErrorResponse7, genericChaloErrorResponse7 != null ? genericChaloErrorResponse7.b : null);
            case 18:
                GenericChaloErrorResponse genericChaloErrorResponse8 = (GenericChaloErrorResponse) obj;
                return new OndcTicketReceiptFetchFailedException(genericChaloErrorResponse8, genericChaloErrorResponse8 != null ? genericChaloErrorResponse8.b : null);
            case 19:
                GenericChaloErrorResponse genericChaloErrorResponse9 = (GenericChaloErrorResponse) obj;
                return new MetroLineStopListFetchFailedException(genericChaloErrorResponse9 != null ? genericChaloErrorResponse9.b : null);
            case 20:
                GenericChaloErrorResponse genericChaloErrorResponse10 = (GenericChaloErrorResponse) obj;
                return new AvailableRoutesFetchFailedException(genericChaloErrorResponse10 != null ? genericChaloErrorResponse10.b : null);
            case 21:
                Function1 emit = (Function1) obj;
                Intrinsics.i(emit, "emit");
                emit.invoke("ondc_metro_ticket_table");
                return unit;
            case 22:
                Function1 emit2 = (Function1) obj;
                Intrinsics.i(emit2, "emit");
                emit2.invoke("ondc_metro_ticket_table");
                return unit;
            case 23:
                Function1 emit3 = (Function1) obj;
                Intrinsics.i(emit3, "emit");
                emit3.invoke("ondc_metro_ticket_table");
                return unit;
            case 24:
                Function1 emit4 = (Function1) obj;
                Intrinsics.i(emit4, "emit");
                emit4.invoke("ondc_metro_ticket_table");
                return unit;
            case 25:
                Function1 emit5 = (Function1) obj;
                Intrinsics.i(emit5, "emit");
                emit5.invoke("ondc_metro_ticket_table");
                return unit;
            case 26:
                Function1 emit6 = (Function1) obj;
                Intrinsics.i(emit6, "emit");
                emit6.invoke("ondc_metro_ticket_table");
                return unit;
            case 27:
                Function1 emit7 = (Function1) obj;
                Intrinsics.i(emit7, "emit");
                emit7.invoke("ondc_ticket_receipt_table");
                return unit;
            case 28:
                Function1 emit8 = (Function1) obj;
                Intrinsics.i(emit8, "emit");
                emit8.invoke("ondc_ticket_table");
                return unit;
            default:
                Function1 emit9 = (Function1) obj;
                Intrinsics.i(emit9, "emit");
                emit9.invoke("ondc_ticket_table");
                return unit;
        }
    }
}
