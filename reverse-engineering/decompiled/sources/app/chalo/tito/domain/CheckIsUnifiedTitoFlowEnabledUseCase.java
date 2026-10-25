package app.chalo.tito.domain;

import app.chalo.contract.BasicInfoContract;
import app.chalo.superpass.utils.ChaloConfigUtils;
import app.chalo.tito.data.model.entity.TITOSetupConfiguration;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/tito/domain/CheckIsUnifiedTitoFlowEnabledUseCase;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CheckIsUnifiedTitoFlowEnabledUseCase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BasicInfoContract f9651a;

    public CheckIsUnifiedTitoFlowEnabledUseCase(BasicInfoContract basicInfoContract) {
        this.f9651a = basicInfoContract;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0052  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(ContinuationImpl continuationImpl) {
        CheckIsUnifiedTitoFlowEnabledUseCase$invoke$1 checkIsUnifiedTitoFlowEnabledUseCase$invoke$1;
        boolean z;
        if (continuationImpl instanceof CheckIsUnifiedTitoFlowEnabledUseCase$invoke$1) {
            checkIsUnifiedTitoFlowEnabledUseCase$invoke$1 = (CheckIsUnifiedTitoFlowEnabledUseCase$invoke$1) continuationImpl;
            int i = checkIsUnifiedTitoFlowEnabledUseCase$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                checkIsUnifiedTitoFlowEnabledUseCase$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                checkIsUnifiedTitoFlowEnabledUseCase$invoke$1 = new CheckIsUnifiedTitoFlowEnabledUseCase$invoke$1(this, continuationImpl);
            }
        } else {
            checkIsUnifiedTitoFlowEnabledUseCase$invoke$1 = new CheckIsUnifiedTitoFlowEnabledUseCase$invoke$1(this, continuationImpl);
        }
        Object objD = checkIsUnifiedTitoFlowEnabledUseCase$invoke$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = checkIsUnifiedTitoFlowEnabledUseCase$invoke$1.label;
        if (i2 == 0) {
            ResultKt.b(objD);
            ChaloConfigUtils chaloConfigUtils = ChaloConfigUtils.f9611a;
            checkIsUnifiedTitoFlowEnabledUseCase$invoke$1.label = 1;
            objD = chaloConfigUtils.d(checkIsUnifiedTitoFlowEnabledUseCase$invoke$1);
            if (objD == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objD);
        }
        TITOSetupConfiguration tITOSetupConfiguration = (TITOSetupConfiguration) objD;
        int iH = this.f9651a.h();
        if (tITOSetupConfiguration.b) {
            z = iH <= tITOSetupConfiguration.i && tITOSetupConfiguration.h <= iH;
        }
        return Boolean.valueOf(z);
    }
}
