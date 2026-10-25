package app.chalo.home.domain;

import app.chalo.data.WalletSetupConfiguration;
import app.chalo.domain.GetWalletSetupConfigurationUseCase;
import app.chalo.providers.cityprovider.CityProvider;
import app.chalo.providers.cityprovider.impl.data.models.app.ChaloTransitMode;
import app.chalo.providers.cityprovider.impl.data.models.app.CityAppModel;
import app.chalo.utils.ProductUtils;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/home/domain/ShouldCallWalletSyncApiUseCase;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ShouldCallWalletSyncApiUseCase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final GetWalletSetupConfigurationUseCase f3078a;
    public final CityProvider b;

    public ShouldCallWalletSyncApiUseCase(GetWalletSetupConfigurationUseCase getWalletSetupConfigurationUseCase, CityProvider cityProvider, ProductUtils productUtils) {
        this.f3078a = getWalletSetupConfigurationUseCase;
        this.b = cityProvider;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(ContinuationImpl continuationImpl) {
        ShouldCallWalletSyncApiUseCase$invoke$1 shouldCallWalletSyncApiUseCase$invoke$1;
        boolean z;
        if (continuationImpl instanceof ShouldCallWalletSyncApiUseCase$invoke$1) {
            shouldCallWalletSyncApiUseCase$invoke$1 = (ShouldCallWalletSyncApiUseCase$invoke$1) continuationImpl;
            int i = shouldCallWalletSyncApiUseCase$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                shouldCallWalletSyncApiUseCase$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                shouldCallWalletSyncApiUseCase$invoke$1 = new ShouldCallWalletSyncApiUseCase$invoke$1(this, continuationImpl);
            }
        } else {
            shouldCallWalletSyncApiUseCase$invoke$1 = new ShouldCallWalletSyncApiUseCase$invoke$1(this, continuationImpl);
        }
        Object obj = shouldCallWalletSyncApiUseCase$invoke$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = shouldCallWalletSyncApiUseCase$invoke$1.label;
        boolean z2 = false;
        if (i2 == 0) {
            ResultKt.b(obj);
            CityAppModel cityAppModel = (CityAppModel) this.b.b().getValue();
            if (cityAppModel != null) {
                boolean zB = ProductUtils.b(ChaloTransitMode.BUS, cityAppModel);
                shouldCallWalletSyncApiUseCase$invoke$1.Z$0 = zB;
                shouldCallWalletSyncApiUseCase$invoke$1.label = 1;
                Object objB = this.f3078a.b(shouldCallWalletSyncApiUseCase$invoke$1);
                if (objB == coroutineSingletons) {
                    return coroutineSingletons;
                }
                z = zB;
                obj = objB;
            }
            return Boolean.valueOf(z2);
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        z = shouldCallWalletSyncApiUseCase$invoke$1.Z$0;
        ResultKt.b(obj);
        WalletSetupConfiguration walletSetupConfiguration = (WalletSetupConfiguration) obj;
        if (z && walletSetupConfiguration.a() && walletSetupConfiguration.b()) {
            z2 = true;
        }
        return Boolean.valueOf(z2);
    }
}
