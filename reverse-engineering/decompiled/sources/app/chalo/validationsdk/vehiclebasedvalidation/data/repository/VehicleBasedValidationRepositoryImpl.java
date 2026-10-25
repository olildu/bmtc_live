package app.chalo.validationsdk.vehiclebasedvalidation.data.repository;

import app.chalo.models.ondc.OndcTicketReceiptApiModel;
import app.chalo.models.ondc.OndcTicketReceiptAppModel;
import app.chalo.models.ondc.OndcTicketReceiptAppModelKt;
import app.chalo.validationsdk.vehiclebasedvalidation.data.models.api.VehicleValidationRequestApiModel;
import app.chalo.validationsdk.vehiclebasedvalidation.data.models.app.VehicleValidationRequestAppModel;
import app.chalo.validationsdk.vehiclebasedvalidation.data.remote.InvalidOndcTicketReceiptDataException;
import app.chalo.validationsdk.vehiclebasedvalidation.data.remote.VehicleBasedValidationRemoteDataSource;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lapp/chalo/validationsdk/vehiclebasedvalidation/data/repository/VehicleBasedValidationRepositoryImpl;", "Lapp/chalo/validationsdk/vehiclebasedvalidation/data/repository/VehicleBasedValidationRepository;", "Companion", "validationsdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class VehicleBasedValidationRepositoryImpl implements VehicleBasedValidationRepository {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final VehicleBasedValidationRemoteDataSource f10712a;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lapp/chalo/validationsdk/vehiclebasedvalidation/data/repository/VehicleBasedValidationRepositoryImpl$Companion;", "", "", "INVALID_RECEIPT_DATA", "Ljava/lang/String;", "validationsdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
    }

    public VehicleBasedValidationRepositoryImpl(VehicleBasedValidationRemoteDataSource vehicleBasedValidationRemoteDataSource) {
        this.f10712a = vehicleBasedValidationRemoteDataSource;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.validationsdk.vehiclebasedvalidation.data.repository.VehicleBasedValidationRepository
    public final Object a(VehicleValidationRequestAppModel vehicleValidationRequestAppModel, ContinuationImpl continuationImpl) throws InvalidOndcTicketReceiptDataException {
        VehicleBasedValidationRepositoryImpl$validateOndcTicketAndFetchReceipt$1 vehicleBasedValidationRepositoryImpl$validateOndcTicketAndFetchReceipt$1;
        if (continuationImpl instanceof VehicleBasedValidationRepositoryImpl$validateOndcTicketAndFetchReceipt$1) {
            vehicleBasedValidationRepositoryImpl$validateOndcTicketAndFetchReceipt$1 = (VehicleBasedValidationRepositoryImpl$validateOndcTicketAndFetchReceipt$1) continuationImpl;
            int i = vehicleBasedValidationRepositoryImpl$validateOndcTicketAndFetchReceipt$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                vehicleBasedValidationRepositoryImpl$validateOndcTicketAndFetchReceipt$1.label = i - Integer.MIN_VALUE;
            } else {
                vehicleBasedValidationRepositoryImpl$validateOndcTicketAndFetchReceipt$1 = new VehicleBasedValidationRepositoryImpl$validateOndcTicketAndFetchReceipt$1(this, continuationImpl);
            }
        } else {
            vehicleBasedValidationRepositoryImpl$validateOndcTicketAndFetchReceipt$1 = new VehicleBasedValidationRepositoryImpl$validateOndcTicketAndFetchReceipt$1(this, continuationImpl);
        }
        Object objA = vehicleBasedValidationRepositoryImpl$validateOndcTicketAndFetchReceipt$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = vehicleBasedValidationRepositoryImpl$validateOndcTicketAndFetchReceipt$1.label;
        if (i2 == 0) {
            ResultKt.b(objA);
            Intrinsics.i(vehicleValidationRequestAppModel, "<this>");
            VehicleValidationRequestApiModel vehicleValidationRequestApiModel = new VehicleValidationRequestApiModel(vehicleValidationRequestAppModel.f10710a, vehicleValidationRequestAppModel.b);
            vehicleBasedValidationRepositoryImpl$validateOndcTicketAndFetchReceipt$1.label = 1;
            objA = this.f10712a.a(vehicleValidationRequestApiModel, vehicleBasedValidationRepositoryImpl$validateOndcTicketAndFetchReceipt$1);
            if (objA == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objA);
        }
        OndcTicketReceiptAppModel ondcTicketReceiptAppModelA = OndcTicketReceiptAppModelKt.a((OndcTicketReceiptApiModel) objA);
        if (ondcTicketReceiptAppModelA != null) {
            return ondcTicketReceiptAppModelA;
        }
        throw new InvalidOndcTicketReceiptDataException();
    }
}
