package defpackage;

import android.content.Context;
import app.chalo.ads.AdsterSdkInitializer;
import app.chalo.features.adjust.AdjustManager;
import app.chalo.features.freshchat.FreshChatInitManager;
import app.chalo.features.freshchat.FreshchatUserInteractionContract;
import app.chalo.helper.MandatoryFirstHistoryCallGuard;
import app.chalo.notification.managers.NotificationCentralProcessingManager;
import app.chalo.notification.managers.NotificationDisplayDataManager;
import app.chalo.onboarding.cityprovider.PostCityChangeOperationExecutor;
import app.chalo.plotline.PlotlineContract;
import app.chalo.plotline.PlotlineNotificationManager;
import app.chalo.security.sync.usecase.GetKeySyncRemoteConfigUseCase;
import app.chalo.utils.DataStorePathHelper;
import app.chalo.worker.ApplicationBackgroundWorkersManager;
import java.io.File;
import java.util.Iterator;
import java.util.LinkedHashSet;
import kotlin.Unit;
import kotlin.collections.ArrayDeque;
import kotlin.io.FilesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.text.StringsKt;
import okio.Path;
import org.koin.android.ext.koin.ModuleExtKt;
import org.koin.core.Koin;
import org.koin.core.scope.Scope;
import org.koin.core.scope.ScopeCallback;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class m4 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18369a;
    public final /* synthetic */ Scope b;

    public /* synthetic */ m4(Scope scope, int i) {
        this.f18369a = i;
        this.b = scope;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        ArrayDeque arrayDeque;
        int i = this.f18369a;
        Scope scope = this.b;
        switch (i) {
            case 0:
                Context contextA = ModuleExtKt.a(scope);
                String strConcat = StringsKt.u("network_config.preferences_pb", ".preferences_pb", false) ? "network_config.preferences_pb" : "network_config.preferences_pb".concat(".preferences_pb");
                File filesDir = contextA.getApplicationContext().getFilesDir();
                Intrinsics.h(filesDir, "getFilesDir(...)");
                File fileC = FilesKt.c(filesDir, "datastore");
                if (!fileC.exists()) {
                    fileC.mkdirs();
                }
                String str = Path.b;
                String absolutePath = FilesKt.c(fileC, strConcat).getAbsolutePath();
                Intrinsics.h(absolutePath, "getAbsolutePath(...)");
                return Path.Companion.a(absolutePath, false);
            case 1:
                Koin koin = scope.e;
                koin.f18815a.a("|- (-) Scope - id:'" + scope.b + '\'');
                LinkedHashSet linkedHashSet = scope.h;
                Iterator it = linkedHashSet.iterator();
                while (it.hasNext()) {
                    ((ScopeCallback) it.next()).a(scope);
                }
                linkedHashSet.clear();
                scope.j = true;
                scope.g = null;
                ThreadLocal threadLocal = scope.i;
                if (threadLocal != null && (arrayDeque = (ArrayDeque) threadLocal.get()) != null) {
                    arrayDeque.clear();
                }
                scope.i = null;
                koin.c.a(scope);
                return Unit.f17538a;
            case 2:
                Context contextA2 = ModuleExtKt.a(scope);
                String strConcat2 = StringsKt.u("analytics.preferences_pb", ".preferences_pb", false) ? "analytics.preferences_pb" : "analytics.preferences_pb".concat(".preferences_pb");
                File filesDir2 = contextA2.getApplicationContext().getFilesDir();
                Intrinsics.h(filesDir2, "getFilesDir(...)");
                File fileC2 = FilesKt.c(filesDir2, "datastore");
                if (!fileC2.exists()) {
                    fileC2.mkdirs();
                }
                String str2 = Path.b;
                String absolutePath2 = FilesKt.c(fileC2, strConcat2).getAbsolutePath();
                Intrinsics.h(absolutePath2, "getAbsolutePath(...)");
                return Path.Companion.a(absolutePath2, false);
            case 3:
                return (FreshChatInitManager) scope.d(Reflection.a(FreshChatInitManager.class), null, null);
            case 4:
                return (FreshchatUserInteractionContract) scope.d(Reflection.a(FreshchatUserInteractionContract.class), null, null);
            case 5:
                return (NotificationCentralProcessingManager) scope.d(Reflection.a(NotificationCentralProcessingManager.class), null, null);
            case 6:
                return (NotificationDisplayDataManager) scope.d(Reflection.a(NotificationDisplayDataManager.class), null, null);
            case 7:
                return DataStorePathHelper.a(ModuleExtKt.a(scope), "config.preferences_pb");
            case 8:
                return DataStorePathHelper.a(ModuleExtKt.a(scope), "proof_document_props_store.preferences_pb");
            case 9:
                return (MandatoryFirstHistoryCallGuard) scope.d(Reflection.a(MandatoryFirstHistoryCallGuard.class), null, null);
            case 10:
                return DataStorePathHelper.a(ModuleExtKt.a(scope), "proof_config_store.preferences_pb");
            case 11:
                return DataStorePathHelper.a(ModuleExtKt.a(scope), "keyChaloConfigDataStore.preferences_pb");
            case 12:
                return DataStorePathHelper.a(ModuleExtKt.a(scope), "session_store.preferences_pb");
            case 13:
                return DataStorePathHelper.a(ModuleExtKt.a(scope), "reportProblemFeature.preferences_pb");
            case 14:
                return DataStorePathHelper.a(ModuleExtKt.a(scope), "user_prefs.preferences_pb");
            case 15:
                return DataStorePathHelper.a(ModuleExtKt.a(scope), "exitInterstitialAdCapStore");
            case 16:
                return DataStorePathHelper.a(ModuleExtKt.a(scope), "last_known_location_cache");
            case 17:
                return DataStorePathHelper.a(ModuleExtKt.a(scope), "rideFeedbackTrackerDataStore");
            case 18:
                return DataStorePathHelper.a(ModuleExtKt.a(scope), "product_config_store.preferences_pb");
            case 19:
                return DataStorePathHelper.a(ModuleExtKt.a(scope), "productReclaimDataStoreKey.preferences_pb");
            case 20:
                return DataStorePathHelper.a(ModuleExtKt.a(scope), "language_store.preferences_pb");
            case 21:
                return DataStorePathHelper.a(ModuleExtKt.a(scope), "appUsageTrackingDataStoreKey.preferences_pb");
            case 22:
                return (AdsterSdkInitializer) scope.d(Reflection.a(AdsterSdkInitializer.class), null, null);
            case 23:
                return DataStorePathHelper.a(ModuleExtKt.a(scope), "chaloTimeStore.preferences_pb");
            case 24:
                return (ApplicationBackgroundWorkersManager) scope.d(Reflection.a(ApplicationBackgroundWorkersManager.class), null, null);
            case 25:
                return (GetKeySyncRemoteConfigUseCase) scope.d(Reflection.a(GetKeySyncRemoteConfigUseCase.class), null, null);
            case 26:
                return (PostCityChangeOperationExecutor) scope.d(Reflection.a(PostCityChangeOperationExecutor.class), null, null);
            case 27:
                return (AdjustManager) scope.d(Reflection.a(AdjustManager.class), null, null);
            case 28:
                return (PlotlineContract) scope.d(Reflection.a(PlotlineContract.class), null, null);
            default:
                return (PlotlineNotificationManager) scope.d(Reflection.a(PlotlineNotificationManager.class), null, null);
        }
    }
}
