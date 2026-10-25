package app.chalo.home.domain;

import androidx.datastore.core.DataStore;
import androidx.datastore.preferences.core.Preferences;
import androidx.datastore.preferences.core.PreferencesKeys;
import androidx.datastore.preferences.core.PreferencesKt;
import app.chalo.buildconfig.ChaloBuildConfig;
import app.chalo.buildconfig.Environment;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lapp/chalo/home/domain/UpdateDebugBuildEnvironmentUseCase;", "", "Companion", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class UpdateDebugBuildEnvironmentUseCase {
    public static final Preferences.Key c = PreferencesKeys.stringKey("ENV");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DataStore f3092a;
    public final ChaloBuildConfig b;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lapp/chalo/home/domain/UpdateDebugBuildEnvironmentUseCase$Companion;", "", "", "ENV_CHANGE_STORE_KEY", "Ljava/lang/String;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
    }

    public UpdateDebugBuildEnvironmentUseCase(DataStore dataStore, ChaloBuildConfig chaloBuildConfig) {
        this.f3092a = dataStore;
        this.b = chaloBuildConfig;
    }

    public final Object a(Environment environment, Continuation continuation) {
        if (this.b.n()) {
            Object objEdit = PreferencesKt.edit(this.f3092a, new UpdateDebugBuildEnvironmentUseCase$invoke$2(environment, null), continuation);
            if (objEdit == CoroutineSingletons.COROUTINE_SUSPENDED) {
                return objEdit;
            }
        }
        return Unit.f17538a;
    }
}
