package defpackage;

import androidx.compose.material3.DrawerState;
import androidx.compose.material3.DrawerValue;
import androidx.window.embedding.EmbeddingBackend;
import app.chalo.electricitybill.data.exceptions.ElectricityBillPaymentOrderCreationException;
import app.chalo.electricitybill.data.remote.ElectricityBillRemoteDataSource;
import app.chalo.electricitybill.data.repository.ElectricityBillRepository;
import app.chalo.electricitybill.ui.ebillfetch.EBillFetchDataState;
import app.chalo.electricitybill.ui.ebillpayment.EBillPaymentConfirmationDataState;
import app.chalo.electricitybill.ui.paymenthistory.ElectricityPaymentHistoryDataState;
import app.chalo.ncmc.ui.entercarddetails.EnterCardDetailsViewState;
import app.chalo.network.model.GenericChaloErrorResponse;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import org.koin.core.definition.BeanDefinition;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b00 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11157a;

    public /* synthetic */ b00(int i) {
        this.f11157a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String str;
        switch (this.f11157a) {
            case 0:
                return Boolean.valueOf(DrawerState._init_$lambda$0((DrawerValue) obj));
            case 1:
                return Float.valueOf(DrawerState.anchoredDraggableState$lambda$1(((Float) obj).floatValue()));
            case 2:
                EBillFetchDataState it = (EBillFetchDataState) obj;
                Intrinsics.i(it, "it");
                return EBillFetchDataState.a(it, false, null, false, null, false, false, false, null, 239);
            case 3:
                EBillFetchDataState it2 = (EBillFetchDataState) obj;
                Intrinsics.i(it2, "it");
                return EBillFetchDataState.a(it2, false, null, false, null, false, false, false, null, 223);
            case 4:
                EBillFetchDataState it3 = (EBillFetchDataState) obj;
                Intrinsics.i(it3, "it");
                return EBillFetchDataState.a(it3, false, null, false, null, false, false, false, null, 191);
            case 5:
                EBillFetchDataState it4 = (EBillFetchDataState) obj;
                Intrinsics.i(it4, "it");
                return EBillFetchDataState.a(it4, false, null, false, null, false, false, false, null, 239);
            case 6:
                return EBillFetchDataState.a((EBillFetchDataState) obj, true, null, false, null, false, false, false, null, 216);
            case 7:
                return EBillFetchDataState.a((EBillFetchDataState) obj, false, null, true, null, false, false, false, null, 248);
            case 8:
                return EBillFetchDataState.a((EBillFetchDataState) obj, false, null, false, "", false, true, false, null, 210);
            case 9:
                EBillPaymentConfirmationDataState it5 = (EBillPaymentConfirmationDataState) obj;
                Intrinsics.i(it5, "it");
                return EBillPaymentConfirmationDataState.a(it5, true, false, null, null, false, 30);
            case 10:
                EBillPaymentConfirmationDataState it6 = (EBillPaymentConfirmationDataState) obj;
                Intrinsics.i(it6, "it");
                return EBillPaymentConfirmationDataState.a(it6, false, true, null, null, false, 29);
            case 11:
                EBillPaymentConfirmationDataState it7 = (EBillPaymentConfirmationDataState) obj;
                Intrinsics.i(it7, "it");
                return EBillPaymentConfirmationDataState.a(it7, false, false, null, null, false, 29);
            case 12:
                EBillPaymentConfirmationDataState it8 = (EBillPaymentConfirmationDataState) obj;
                Intrinsics.i(it8, "it");
                return EBillPaymentConfirmationDataState.a(it8, false, false, null, null, false, 15);
            case 13:
                return EBillPaymentConfirmationDataState.a((EBillPaymentConfirmationDataState) obj, false, false, null, null, false, 30);
            case 14:
                return EBillPaymentConfirmationDataState.a((EBillPaymentConfirmationDataState) obj, true, false, null, null, false, 28);
            case 15:
                return EBillPaymentConfirmationDataState.a((EBillPaymentConfirmationDataState) obj, false, false, null, null, false, 30);
            case 16:
                BeanDefinition factoryOf = (BeanDefinition) obj;
                Intrinsics.i(factoryOf, "$this$factoryOf");
                factoryOf.f = CollectionsKt.d0(Reflection.a(ElectricityBillRepository.class), factoryOf.f);
                return Unit.f17538a;
            case 17:
                BeanDefinition factoryOf2 = (BeanDefinition) obj;
                Intrinsics.i(factoryOf2, "$this$factoryOf");
                factoryOf2.f = CollectionsKt.d0(Reflection.a(ElectricityBillRemoteDataSource.class), factoryOf2.f);
                return Unit.f17538a;
            case 18:
                ElectricityPaymentHistoryDataState it9 = (ElectricityPaymentHistoryDataState) obj;
                Intrinsics.i(it9, "it");
                return ElectricityPaymentHistoryDataState.a(it9, true, null, null, null, false, 26);
            case 19:
                ElectricityPaymentHistoryDataState it10 = (ElectricityPaymentHistoryDataState) obj;
                Intrinsics.i(it10, "it");
                return ElectricityPaymentHistoryDataState.a(it10, false, null, null, null, false, 23);
            case 20:
                GenericChaloErrorResponse genericChaloErrorResponse = (GenericChaloErrorResponse) obj;
                if (genericChaloErrorResponse == null || (str = genericChaloErrorResponse.b) == null) {
                    str = "Something went wrong";
                }
                return new ElectricityBillPaymentOrderCreationException(genericChaloErrorResponse, str);
            case 21:
                return EmbeddingBackend.Companion.reset$lambda$1((EmbeddingBackend) obj);
            case 22:
                return EmbeddingBackend.Companion.decorator$lambda$0((EmbeddingBackend) obj);
            case 23:
                EnterCardDetailsViewState it11 = (EnterCardDetailsViewState) obj;
                Intrinsics.i(it11, "it");
                return EnterCardDetailsViewState.a(it11, null, null, null, null, false, false, false, false, false, null, false, 2047);
            case 24:
                EnterCardDetailsViewState it12 = (EnterCardDetailsViewState) obj;
                Intrinsics.i(it12, "it");
                return EnterCardDetailsViewState.a(it12, null, null, null, null, false, false, false, false, false, null, false, 2047);
            case 25:
                EnterCardDetailsViewState it13 = (EnterCardDetailsViewState) obj;
                Intrinsics.i(it13, "it");
                return EnterCardDetailsViewState.a(it13, null, null, null, null, true, false, false, false, false, null, false, 4047);
            case 26:
                EnterCardDetailsViewState it14 = (EnterCardDetailsViewState) obj;
                Intrinsics.i(it14, "it");
                return EnterCardDetailsViewState.a(it14, null, null, null, null, false, false, false, false, false, null, false, 4063);
            case 27:
                return EnterCardDetailsViewState.a((EnterCardDetailsViewState) obj, null, null, null, null, false, false, false, true, false, null, false, 3327);
            case 28:
                return EnterCardDetailsViewState.a((EnterCardDetailsViewState) obj, null, null, null, null, false, false, false, false, true, null, false, 3327);
            default:
                return EnterCardDetailsViewState.a((EnterCardDetailsViewState) obj, null, null, null, null, false, false, true, false, false, null, false, 3967);
        }
    }
}
