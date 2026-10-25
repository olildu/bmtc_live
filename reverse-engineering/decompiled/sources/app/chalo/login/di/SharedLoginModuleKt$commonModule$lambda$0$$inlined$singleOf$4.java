package app.chalo.login.di;

import androidx.datastore.core.DataStore;
import app.chalo.contract.BasicInfoContract;
import app.chalo.crashlytics.CrashlyticsLogger;
import app.chalo.features.fcmtoken.FcmTokenFeatureImpl;
import app.chalo.features.freshchat.FreshChatInitManager;
import app.chalo.network.NetworkManager;
import app.chalo.notification.core.GCMReceiver;
import app.chalo.plotline.PlotlineNotificationManager;
import app.chalo.providers.CoroutineContextProvider;
import app.chalo.providers.UserProfileDetailsProvider;
import app.chalo.thoughtnudge.ThoughtNudgeNotificationManager;
import defpackage.i71;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Reflection;
import org.koin.core.error.ClosedScopeException;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.scope.Scope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
public final class SharedLoginModuleKt$commonModule$lambda$0$$inlined$singleOf$4 implements Function2<Scope, ParametersHolder, FcmTokenFeatureImpl> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) throws ClosedScopeException {
        Scope scope = (Scope) obj;
        Object objD = scope.d(i71.k(scope, "$this$single", (ParametersHolder) obj2, "it", GCMReceiver.class), null, null);
        Object objD2 = scope.d(Reflection.a(CoroutineContextProvider.class), null, null);
        Object objD3 = scope.d(Reflection.a(NetworkManager.class), null, null);
        Object objD4 = scope.d(Reflection.a(UserProfileDetailsProvider.class), null, null);
        Object objD5 = scope.d(Reflection.a(BasicInfoContract.class), null, null);
        Object objD6 = scope.d(Reflection.a(DataStore.class), null, null);
        Object objD7 = scope.d(Reflection.a(CrashlyticsLogger.class), null, null);
        Object objD8 = scope.d(Reflection.a(FreshChatInitManager.class), null, null);
        return new FcmTokenFeatureImpl((GCMReceiver) objD, (CoroutineContextProvider) objD2, (NetworkManager) objD3, (UserProfileDetailsProvider) objD4, (BasicInfoContract) objD5, (DataStore) objD6, (CrashlyticsLogger) objD7, (FreshChatInitManager) objD8, (PlotlineNotificationManager) scope.d(Reflection.a(PlotlineNotificationManager.class), null, null), (ThoughtNudgeNotificationManager) scope.d(Reflection.a(ThoughtNudgeNotificationManager.class), null, null));
    }
}
