package app.chalo.home.data.repository;

import app.chalo.home.data.exceptions.PremiumPassSavingInvalidDataException;
import app.chalo.home.data.model.api.response.PassSavingResponseApiModel;
import app.chalo.home.data.model.app.response.PassSavingResponseAppModel;
import app.chalo.home.data.remote.PremiumPassSavingRemoteDataSource;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/data/repository/PremiumPassSavingRemoteRepositoryImpl;", "Lapp/chalo/home/data/repository/PremiumPassSavingRemoteRepository;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class PremiumPassSavingRemoteRepositoryImpl implements PremiumPassSavingRemoteRepository {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PremiumPassSavingRemoteDataSource f2982a;

    public PremiumPassSavingRemoteRepositoryImpl(PremiumPassSavingRemoteDataSource premiumPassSavingRemoteDataSource) {
        this.f2982a = premiumPassSavingRemoteDataSource;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.home.data.repository.PremiumPassSavingRemoteRepository
    public final Object a(String str, ContinuationImpl continuationImpl) throws PremiumPassSavingInvalidDataException {
        PremiumPassSavingRemoteRepositoryImpl$fetchPremiumPassSaving$1 premiumPassSavingRemoteRepositoryImpl$fetchPremiumPassSaving$1;
        if (continuationImpl instanceof PremiumPassSavingRemoteRepositoryImpl$fetchPremiumPassSaving$1) {
            premiumPassSavingRemoteRepositoryImpl$fetchPremiumPassSaving$1 = (PremiumPassSavingRemoteRepositoryImpl$fetchPremiumPassSaving$1) continuationImpl;
            int i = premiumPassSavingRemoteRepositoryImpl$fetchPremiumPassSaving$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                premiumPassSavingRemoteRepositoryImpl$fetchPremiumPassSaving$1.label = i - Integer.MIN_VALUE;
            } else {
                premiumPassSavingRemoteRepositoryImpl$fetchPremiumPassSaving$1 = new PremiumPassSavingRemoteRepositoryImpl$fetchPremiumPassSaving$1(this, continuationImpl);
            }
        } else {
            premiumPassSavingRemoteRepositoryImpl$fetchPremiumPassSaving$1 = new PremiumPassSavingRemoteRepositoryImpl$fetchPremiumPassSaving$1(this, continuationImpl);
        }
        Object objA = premiumPassSavingRemoteRepositoryImpl$fetchPremiumPassSaving$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = premiumPassSavingRemoteRepositoryImpl$fetchPremiumPassSaving$1.label;
        if (i2 == 0) {
            ResultKt.b(objA);
            premiumPassSavingRemoteRepositoryImpl$fetchPremiumPassSaving$1.label = 1;
            objA = this.f2982a.a(str, premiumPassSavingRemoteRepositoryImpl$fetchPremiumPassSaving$1);
            if (objA == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objA);
        }
        PassSavingResponseApiModel passSavingResponseApiModel = (PassSavingResponseApiModel) objA;
        Intrinsics.i(passSavingResponseApiModel, "<this>");
        Integer num = passSavingResponseApiModel.f2932a;
        PassSavingResponseAppModel passSavingResponseAppModel = num != null ? new PassSavingResponseAppModel(num.intValue()) : null;
        if (passSavingResponseAppModel != null) {
            return passSavingResponseAppModel;
        }
        throw new PremiumPassSavingInvalidDataException();
    }
}
