package app.chalo.juspay;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/juspay/JuspaySignatureRepositoryImpl;", "Lapp/chalo/juspay/JuspaySignatureRepository;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class JuspaySignatureRepositoryImpl implements JuspaySignatureRepository {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JuspaySignatureRemoteDataSource f4076a;

    public JuspaySignatureRepositoryImpl(JuspaySignatureRemoteDataSource juspaySignatureRemoteDataSource) {
        this.f4076a = juspaySignatureRemoteDataSource;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.juspay.JuspaySignatureRepository
    public final Object a(JusPaySignatureRequestApiModel jusPaySignatureRequestApiModel, ContinuationImpl continuationImpl) {
        JuspaySignatureRepositoryImpl$getJuspaySignature$1 juspaySignatureRepositoryImpl$getJuspaySignature$1;
        if (continuationImpl instanceof JuspaySignatureRepositoryImpl$getJuspaySignature$1) {
            juspaySignatureRepositoryImpl$getJuspaySignature$1 = (JuspaySignatureRepositoryImpl$getJuspaySignature$1) continuationImpl;
            int i = juspaySignatureRepositoryImpl$getJuspaySignature$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                juspaySignatureRepositoryImpl$getJuspaySignature$1.label = i - Integer.MIN_VALUE;
            } else {
                juspaySignatureRepositoryImpl$getJuspaySignature$1 = new JuspaySignatureRepositoryImpl$getJuspaySignature$1(this, continuationImpl);
            }
        } else {
            juspaySignatureRepositoryImpl$getJuspaySignature$1 = new JuspaySignatureRepositoryImpl$getJuspaySignature$1(this, continuationImpl);
        }
        Object objA = juspaySignatureRepositoryImpl$getJuspaySignature$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = juspaySignatureRepositoryImpl$getJuspaySignature$1.label;
        if (i2 == 0) {
            ResultKt.b(objA);
            juspaySignatureRepositoryImpl$getJuspaySignature$1.label = 1;
            objA = this.f4076a.a(jusPaySignatureRequestApiModel, juspaySignatureRepositoryImpl$getJuspaySignature$1);
            if (objA == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objA);
        }
        JusPaySignatureResponseApiModel jusPaySignatureResponseApiModel = (JusPaySignatureResponseApiModel) objA;
        Intrinsics.i(jusPaySignatureResponseApiModel, "<this>");
        return new JusPaySignaturesAppModel(jusPaySignatureResponseApiModel.b, jusPaySignatureResponseApiModel.f4024a, jusPaySignatureResponseApiModel.c, jusPaySignatureResponseApiModel.d);
    }
}
