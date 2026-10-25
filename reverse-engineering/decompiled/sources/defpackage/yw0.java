package defpackage;

import android.content.Context;
import androidx.compose.foundation.text.contextmenu.ProcessTextApi23Impl;
import app.chalo.features.productsync.error.ProductDataSyncFailedException;
import app.chalo.network.model.GenericChaloErrorResponse;
import app.chalo.productactivation.ui.ProductActivationDataState;
import app.chalo.productpurchase.productselection.data.exceptions.AllProductsConfigFetchFailedException;
import app.chalo.productpurchase.productselection.data.exceptions.FreeRidesFetchException;
import app.chalo.productpurchase.productselection.data.exceptions.MTicketFareFetchFailedException;
import app.chalo.productpurchase.productselection.data.exceptions.MTicketOrderCreationException;
import app.chalo.productpurchase.productselection.data.exceptions.PassApplicationSubmissionFailedException;
import app.chalo.productpurchase.productselection.data.exceptions.PassCashPaymentInfoFetchFailedException;
import app.chalo.productpurchase.productselection.data.exceptions.SuperPassOrderCreationFailedException;
import app.chalo.productpurchase.productselection.ui.ProductSelectionDataState;
import app.chalo.productsummary.data.exceptions.ProductInvoiceGenerationFailedException;
import app.chalo.validationsdk.blevalidation.data.exception.FetchProductValidationDataForActivationException;
import app.chalo.validationsdk.blevalidation.data.exception.FetchTitoTapinDataException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class yw0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20148a;

    public /* synthetic */ yw0(int i) {
        this.f20148a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String str;
        String str2;
        String str3;
        switch (this.f20148a) {
            case 0:
                Function1 emit = (Function1) obj;
                Intrinsics.i(emit, "emit");
                emit.invoke("premium_reserve_ticket_table");
                return Unit.f17538a;
            case 1:
                Function1 emit2 = (Function1) obj;
                Intrinsics.i(emit2, "emit");
                emit2.invoke("premium_reserve_ticket_table");
                return Unit.f17538a;
            case 2:
                Function1 emit3 = (Function1) obj;
                Intrinsics.i(emit3, "emit");
                emit3.invoke("premium_reserve_ticket_table");
                return Unit.f17538a;
            case 3:
                Function1 emit4 = (Function1) obj;
                Intrinsics.i(emit4, "emit");
                emit4.invoke("premium_reserve_ticket_table");
                return Unit.f17538a;
            case 4:
                Function1 emit5 = (Function1) obj;
                Intrinsics.i(emit5, "emit");
                emit5.invoke("premium_reserve_trip_table");
                return Unit.f17538a;
            case 5:
                Function1 emit6 = (Function1) obj;
                Intrinsics.i(emit6, "emit");
                emit6.invoke("premium_reserve_trip_table");
                return Unit.f17538a;
            case 6:
                Function1 emit7 = (Function1) obj;
                Intrinsics.i(emit7, "emit");
                emit7.invoke("premium_reserve_trip_table");
                return Unit.f17538a;
            case 7:
                Function1 emit8 = (Function1) obj;
                Intrinsics.i(emit8, "emit");
                emit8.invoke("premium_reserve_trip_table");
                return Unit.f17538a;
            case 8:
                return ProcessTextApi23Impl.processTextActivitiesQuery$lambda$0((Context) obj);
            case 9:
                ProductActivationDataState it = (ProductActivationDataState) obj;
                Intrinsics.i(it, "it");
                return ProductActivationDataState.a(it, null, null, null, null, false, null, null, null, null, false, null, null, false, 16379);
            case 10:
                ProductActivationDataState it2 = (ProductActivationDataState) obj;
                Intrinsics.i(it2, "it");
                return ProductActivationDataState.a(it2, null, null, null, null, false, null, null, null, null, false, null, null, false, 16367);
            case 11:
                ProductActivationDataState it3 = (ProductActivationDataState) obj;
                Intrinsics.i(it3, "it");
                return ProductActivationDataState.a(it3, null, null, null, null, true, null, null, null, null, false, null, null, false, 16367);
            case 12:
                ProductActivationDataState it4 = (ProductActivationDataState) obj;
                Intrinsics.i(it4, "it");
                return ProductActivationDataState.a(it4, null, null, null, null, false, null, null, null, null, false, null, null, !it4.n, 8191);
            case 13:
                ProductActivationDataState it5 = (ProductActivationDataState) obj;
                Intrinsics.i(it5, "it");
                return ProductActivationDataState.a(it5, null, null, null, null, false, null, null, null, null, false, null, null, false, 16367);
            case 14:
                ProductActivationDataState it6 = (ProductActivationDataState) obj;
                Intrinsics.i(it6, "it");
                return ProductActivationDataState.a(it6, null, null, null, null, false, null, null, null, null, false, null, null, false, 16379);
            case 15:
                GenericChaloErrorResponse genericChaloErrorResponse = (GenericChaloErrorResponse) obj;
                if (genericChaloErrorResponse == null || (str = genericChaloErrorResponse.b) == null) {
                    str = "Something went wrong";
                }
                return new ProductDataSyncFailedException(genericChaloErrorResponse, str);
            case 16:
                GenericChaloErrorResponse genericChaloErrorResponse2 = (GenericChaloErrorResponse) obj;
                return new ProductInvoiceGenerationFailedException(genericChaloErrorResponse2, genericChaloErrorResponse2 != null ? genericChaloErrorResponse2.b : null);
            case 17:
                GenericChaloErrorResponse genericChaloErrorResponse3 = (GenericChaloErrorResponse) obj;
                return new MTicketOrderCreationException(genericChaloErrorResponse3, genericChaloErrorResponse3 != null ? genericChaloErrorResponse3.b : null);
            case 18:
                GenericChaloErrorResponse genericChaloErrorResponse4 = (GenericChaloErrorResponse) obj;
                return new PassApplicationSubmissionFailedException(genericChaloErrorResponse4, genericChaloErrorResponse4 != null ? genericChaloErrorResponse4.b : null);
            case 19:
                GenericChaloErrorResponse genericChaloErrorResponse5 = (GenericChaloErrorResponse) obj;
                return new MTicketFareFetchFailedException(genericChaloErrorResponse5 != null ? genericChaloErrorResponse5.b : null);
            case 20:
                GenericChaloErrorResponse genericChaloErrorResponse6 = (GenericChaloErrorResponse) obj;
                if (genericChaloErrorResponse6 == null || (str2 = genericChaloErrorResponse6.b) == null) {
                    str2 = "Something went wrong";
                }
                return new PassCashPaymentInfoFetchFailedException(genericChaloErrorResponse6, str2);
            case 21:
                GenericChaloErrorResponse genericChaloErrorResponse7 = (GenericChaloErrorResponse) obj;
                if (genericChaloErrorResponse7 == null || (str3 = genericChaloErrorResponse7.b) == null) {
                    str3 = "Something went wrong";
                }
                return new SuperPassOrderCreationFailedException(genericChaloErrorResponse7, Integer.valueOf(genericChaloErrorResponse7 != null ? genericChaloErrorResponse7.f6497a : -1), str3);
            case 22:
                GenericChaloErrorResponse genericChaloErrorResponse8 = (GenericChaloErrorResponse) obj;
                return new FreeRidesFetchException(genericChaloErrorResponse8, genericChaloErrorResponse8 != null ? genericChaloErrorResponse8.b : null);
            case 23:
                GenericChaloErrorResponse genericChaloErrorResponse9 = (GenericChaloErrorResponse) obj;
                return new AllProductsConfigFetchFailedException(genericChaloErrorResponse9 != null ? genericChaloErrorResponse9.b : null);
            case 24:
                ProductSelectionDataState it7 = (ProductSelectionDataState) obj;
                Intrinsics.i(it7, "it");
                return ProductSelectionDataState.a(it7, null, false, false, null, null, false, null, null, null, 991);
            case 25:
                ProductSelectionDataState it8 = (ProductSelectionDataState) obj;
                Intrinsics.i(it8, "it");
                return ProductSelectionDataState.a(it8, null, false, true, null, null, false, null, null, null, 1011);
            case 26:
                ProductSelectionDataState it9 = (ProductSelectionDataState) obj;
                Intrinsics.i(it9, "it");
                return ProductSelectionDataState.a(it9, null, true, false, null, null, false, null, null, null, 1011);
            case 27:
                return ProductSelectionDataState.a((ProductSelectionDataState) obj, null, false, false, null, null, false, null, null, null, 991);
            case 28:
                GenericChaloErrorResponse genericChaloErrorResponse10 = (GenericChaloErrorResponse) obj;
                return new FetchTitoTapinDataException(genericChaloErrorResponse10, genericChaloErrorResponse10 != null ? genericChaloErrorResponse10.b : null);
            default:
                GenericChaloErrorResponse genericChaloErrorResponse11 = (GenericChaloErrorResponse) obj;
                return new FetchProductValidationDataForActivationException(genericChaloErrorResponse11, genericChaloErrorResponse11 != null ? genericChaloErrorResponse11.b : null);
        }
    }
}
