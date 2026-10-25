package app.chalo.electricitybill.data.repository;

import app.chalo.contract.BasicInfoContract;
import app.chalo.electricitybill.data.model.apimodel.request.EbillProps;
import app.chalo.electricitybill.data.model.apimodel.request.ElectricityBillPaymentCreateOrderRequestApiModel;
import app.chalo.electricitybill.data.model.apimodel.response.ElectricityBillPaymentHistoryApiModel;
import app.chalo.electricitybill.data.model.apimodel.response.ElectricityBillPaymentHistoryResponseApiModel;
import app.chalo.electricitybill.data.model.apimodel.response.FetchElectricityBillResponseApiModel;
import app.chalo.electricitybill.data.model.appmodel.ElectricityBillAppModel;
import app.chalo.electricitybill.data.model.appmodel.ElectricityBillPaymentHistoryAppModel;
import app.chalo.electricitybill.data.remote.ElectricityBillRemoteDataSource;
import app.chalo.models.ordercreation.CreateOrderResponseApiModel;
import app.chalo.models.ordercreation.CreateOrderResponseApiModelKt;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/electricitybill/data/repository/ElectricityBillRepositoryImpl;", "Lapp/chalo/electricitybill/data/repository/ElectricityBillRepository;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ElectricityBillRepositoryImpl implements ElectricityBillRepository {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ElectricityBillRemoteDataSource f2542a;
    public final BasicInfoContract b;

    public ElectricityBillRepositoryImpl(ElectricityBillRemoteDataSource electricityBillRemoteDataSource, BasicInfoContract basicInfoContract) {
        this.f2542a = electricityBillRemoteDataSource;
        this.b = basicInfoContract;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.electricitybill.data.repository.ElectricityBillRepository
    public final Serializable a(ContinuationImpl continuationImpl) {
        ElectricityBillRepositoryImpl$getPaymentHistory$1 electricityBillRepositoryImpl$getPaymentHistory$1;
        if (continuationImpl instanceof ElectricityBillRepositoryImpl$getPaymentHistory$1) {
            electricityBillRepositoryImpl$getPaymentHistory$1 = (ElectricityBillRepositoryImpl$getPaymentHistory$1) continuationImpl;
            int i = electricityBillRepositoryImpl$getPaymentHistory$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                electricityBillRepositoryImpl$getPaymentHistory$1.label = i - Integer.MIN_VALUE;
            } else {
                electricityBillRepositoryImpl$getPaymentHistory$1 = new ElectricityBillRepositoryImpl$getPaymentHistory$1(this, continuationImpl);
            }
        } else {
            electricityBillRepositoryImpl$getPaymentHistory$1 = new ElectricityBillRepositoryImpl$getPaymentHistory$1(this, continuationImpl);
        }
        Object objA = electricityBillRepositoryImpl$getPaymentHistory$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = electricityBillRepositoryImpl$getPaymentHistory$1.label;
        if (i2 == 0) {
            ResultKt.b(objA);
            electricityBillRepositoryImpl$getPaymentHistory$1.label = 1;
            objA = this.f2542a.a(electricityBillRepositoryImpl$getPaymentHistory$1);
            if (objA == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objA);
        }
        List list = ((ElectricityBillPaymentHistoryResponseApiModel) objA).f2534a;
        if (list == null) {
            return EmptyList.f17557a;
        }
        List<ElectricityBillPaymentHistoryApiModel> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.v(list2, 10));
        for (ElectricityBillPaymentHistoryApiModel electricityBillPaymentHistoryApiModel : list2) {
            Intrinsics.i(electricityBillPaymentHistoryApiModel, "<this>");
            arrayList.add(new ElectricityBillPaymentHistoryAppModel(electricityBillPaymentHistoryApiModel.f2532a, electricityBillPaymentHistoryApiModel.b, electricityBillPaymentHistoryApiModel.c, electricityBillPaymentHistoryApiModel.d, electricityBillPaymentHistoryApiModel.e, electricityBillPaymentHistoryApiModel.g, electricityBillPaymentHistoryApiModel.i, electricityBillPaymentHistoryApiModel.j, electricityBillPaymentHistoryApiModel.k, electricityBillPaymentHistoryApiModel.l));
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.electricitybill.data.repository.ElectricityBillRepository
    public final Object b(String str, ContinuationImpl continuationImpl) {
        ElectricityBillRepositoryImpl$fetchElectricityBill$1 electricityBillRepositoryImpl$fetchElectricityBill$1;
        if (continuationImpl instanceof ElectricityBillRepositoryImpl$fetchElectricityBill$1) {
            electricityBillRepositoryImpl$fetchElectricityBill$1 = (ElectricityBillRepositoryImpl$fetchElectricityBill$1) continuationImpl;
            int i = electricityBillRepositoryImpl$fetchElectricityBill$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                electricityBillRepositoryImpl$fetchElectricityBill$1.label = i - Integer.MIN_VALUE;
            } else {
                electricityBillRepositoryImpl$fetchElectricityBill$1 = new ElectricityBillRepositoryImpl$fetchElectricityBill$1(this, continuationImpl);
            }
        } else {
            electricityBillRepositoryImpl$fetchElectricityBill$1 = new ElectricityBillRepositoryImpl$fetchElectricityBill$1(this, continuationImpl);
        }
        Object objB = electricityBillRepositoryImpl$fetchElectricityBill$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = electricityBillRepositoryImpl$fetchElectricityBill$1.label;
        if (i2 == 0) {
            ResultKt.b(objB);
            electricityBillRepositoryImpl$fetchElectricityBill$1.label = 1;
            objB = this.f2542a.b(str, electricityBillRepositoryImpl$fetchElectricityBill$1);
            if (objB == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objB);
        }
        FetchElectricityBillResponseApiModel fetchElectricityBillResponseApiModel = (FetchElectricityBillResponseApiModel) objB;
        Intrinsics.i(fetchElectricityBillResponseApiModel, "<this>");
        int i3 = fetchElectricityBillResponseApiModel.f;
        int i4 = i3 < 0 ? 0 : i3;
        long j = fetchElectricityBillResponseApiModel.f2536a;
        long j2 = fetchElectricityBillResponseApiModel.b;
        String str2 = fetchElectricityBillResponseApiModel.d;
        String str3 = fetchElectricityBillResponseApiModel.e;
        Boolean bool = fetchElectricityBillResponseApiModel.c;
        return new ElectricityBillAppModel(j, j2, str2, str3, bool != null ? bool.booleanValue() : false, fetchElectricityBillResponseApiModel.f, i4, null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    @Override // app.chalo.electricitybill.data.repository.ElectricityBillRepository
    public final Object c(String str, String str2, int i, String str3, long j, long j2, String str4, String str5, ContinuationImpl continuationImpl) {
        ElectricityBillRepositoryImpl$createElectricityBillPaymentOrder$1 electricityBillRepositoryImpl$createElectricityBillPaymentOrder$1;
        if (continuationImpl instanceof ElectricityBillRepositoryImpl$createElectricityBillPaymentOrder$1) {
            electricityBillRepositoryImpl$createElectricityBillPaymentOrder$1 = (ElectricityBillRepositoryImpl$createElectricityBillPaymentOrder$1) continuationImpl;
            int i2 = electricityBillRepositoryImpl$createElectricityBillPaymentOrder$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                electricityBillRepositoryImpl$createElectricityBillPaymentOrder$1.label = i2 - Integer.MIN_VALUE;
            } else {
                electricityBillRepositoryImpl$createElectricityBillPaymentOrder$1 = new ElectricityBillRepositoryImpl$createElectricityBillPaymentOrder$1(this, continuationImpl);
            }
        } else {
            electricityBillRepositoryImpl$createElectricityBillPaymentOrder$1 = new ElectricityBillRepositoryImpl$createElectricityBillPaymentOrder$1(this, continuationImpl);
        }
        Object objC = electricityBillRepositoryImpl$createElectricityBillPaymentOrder$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = electricityBillRepositoryImpl$createElectricityBillPaymentOrder$1.label;
        if (i3 == 0) {
            ResultKt.b(objC);
            BasicInfoContract basicInfoContract = this.b;
            ElectricityBillPaymentCreateOrderRequestApiModel electricityBillPaymentCreateOrderRequestApiModel = new ElectricityBillPaymentCreateOrderRequestApiModel(str2, basicInfoContract.h(), basicInfoContract.getDeviceId(), str, new EbillProps(i, str3, j2, j, str4, str5));
            electricityBillRepositoryImpl$createElectricityBillPaymentOrder$1.label = 1;
            objC = this.f2542a.c(electricityBillPaymentCreateOrderRequestApiModel, electricityBillRepositoryImpl$createElectricityBillPaymentOrder$1);
            if (objC == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objC);
        }
        return CreateOrderResponseApiModelKt.a((CreateOrderResponseApiModel) objC);
    }
}
