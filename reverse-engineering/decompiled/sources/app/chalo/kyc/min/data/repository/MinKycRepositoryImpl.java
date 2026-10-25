package app.chalo.kyc.min.data.repository;

import app.chalo.kyc.min.data.models.apimodels.MinKycRegisterApiModel;
import app.chalo.kyc.min.data.models.apimodels.MinKycSubmitDataResponseApiModel;
import app.chalo.kyc.min.data.models.appmodels.KycWalletStatus;
import app.chalo.kyc.min.data.models.appmodels.MinKycRegisterAppModel;
import app.chalo.kyc.min.data.models.appmodels.MinKycSubmitDataResponseAppModel;
import app.chalo.kyc.min.data.models.requestapimodels.MinKycSubmitDataRequestApiModelWithOTP;
import app.chalo.kyc.min.data.remote.MinKycRemoteDataSource;
import app.chalo.walletframework.wallet.data.model.CachedWalletStatus;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/kyc/min/data/repository/MinKycRepositoryImpl;", "Lapp/chalo/kyc/min/data/repository/MinKycRepository;", "kyc_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class MinKycRepositoryImpl implements MinKycRepository {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MinKycRemoteDataSource f4109a;

    public MinKycRepositoryImpl(MinKycRemoteDataSource minKycRemoteDataSource) {
        this.f4109a = minKycRemoteDataSource;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.kyc.min.data.repository.MinKycRepository
    public final Object a(boolean z, ContinuationImpl continuationImpl) {
        MinKycRepositoryImpl$registerUser$1 minKycRepositoryImpl$registerUser$1;
        KycWalletStatus next;
        if (continuationImpl instanceof MinKycRepositoryImpl$registerUser$1) {
            minKycRepositoryImpl$registerUser$1 = (MinKycRepositoryImpl$registerUser$1) continuationImpl;
            int i = minKycRepositoryImpl$registerUser$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                minKycRepositoryImpl$registerUser$1.label = i - Integer.MIN_VALUE;
            } else {
                minKycRepositoryImpl$registerUser$1 = new MinKycRepositoryImpl$registerUser$1(this, continuationImpl);
            }
        } else {
            minKycRepositoryImpl$registerUser$1 = new MinKycRepositoryImpl$registerUser$1(this, continuationImpl);
        }
        Object objA = minKycRepositoryImpl$registerUser$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = minKycRepositoryImpl$registerUser$1.label;
        if (i2 == 0) {
            ResultKt.b(objA);
            minKycRepositoryImpl$registerUser$1.label = 1;
            objA = this.f4109a.a(z, minKycRepositoryImpl$registerUser$1);
            if (objA == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objA);
        }
        MinKycRegisterApiModel minKycRegisterApiModel = (MinKycRegisterApiModel) objA;
        String str = minKycRegisterApiModel.c;
        KycWalletStatus.Companion companion = KycWalletStatus.INSTANCE;
        String featureTypeString = minKycRegisterApiModel.f4098a;
        companion.getClass();
        Intrinsics.i(featureTypeString, "featureTypeString");
        Iterator<KycWalletStatus> it = KycWalletStatus.getEntries().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!Intrinsics.d(next.getStatus(), featureTypeString));
        KycWalletStatus kycWalletStatus = next;
        if (kycWalletStatus == null) {
            kycWalletStatus = KycWalletStatus.UNKNOWN;
        }
        return new MinKycRegisterAppModel(str, kycWalletStatus);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.kyc.min.data.repository.MinKycRepository
    public final Object b(MinKycSubmitDataRequestApiModelWithOTP minKycSubmitDataRequestApiModelWithOTP, ContinuationImpl continuationImpl) {
        MinKycRepositoryImpl$submitKyc$1 minKycRepositoryImpl$submitKyc$1;
        if (continuationImpl instanceof MinKycRepositoryImpl$submitKyc$1) {
            minKycRepositoryImpl$submitKyc$1 = (MinKycRepositoryImpl$submitKyc$1) continuationImpl;
            int i = minKycRepositoryImpl$submitKyc$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                minKycRepositoryImpl$submitKyc$1.label = i - Integer.MIN_VALUE;
            } else {
                minKycRepositoryImpl$submitKyc$1 = new MinKycRepositoryImpl$submitKyc$1(this, continuationImpl);
            }
        } else {
            minKycRepositoryImpl$submitKyc$1 = new MinKycRepositoryImpl$submitKyc$1(this, continuationImpl);
        }
        Object objB = minKycRepositoryImpl$submitKyc$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = minKycRepositoryImpl$submitKyc$1.label;
        if (i2 == 0) {
            ResultKt.b(objB);
            minKycRepositoryImpl$submitKyc$1.label = 1;
            objB = this.f4109a.b(minKycSubmitDataRequestApiModelWithOTP, minKycRepositoryImpl$submitKyc$1);
            if (objB == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objB);
        }
        MinKycSubmitDataResponseApiModel minKycSubmitDataResponseApiModel = (MinKycSubmitDataResponseApiModel) objB;
        Intrinsics.i(minKycSubmitDataResponseApiModel, "<this>");
        return new MinKycSubmitDataResponseAppModel(minKycSubmitDataResponseApiModel.f4100a, CachedWalletStatus.ACTIVE, minKycSubmitDataResponseApiModel.d, minKycSubmitDataResponseApiModel.e, minKycSubmitDataResponseApiModel.f);
    }
}
