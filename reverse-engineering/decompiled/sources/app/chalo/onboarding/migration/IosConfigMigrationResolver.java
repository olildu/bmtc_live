package app.chalo.onboarding.migration;

import androidx.datastore.preferences.core.Preferences;
import androidx.datastore.preferences.core.PreferencesKeys;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lapp/chalo/onboarding/migration/IosConfigMigrationResolver;", "", "Companion", "onboarding_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class IosConfigMigrationResolver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Preferences.Key f6679a = PreferencesKeys.booleanKey("requireRemoteConfigFetch");
    public static final Preferences.Key b = PreferencesKeys.booleanKey("requireHomeConfigFetch");

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0005¨\u0006\u0007"}, d2 = {"Lapp/chalo/onboarding/migration/IosConfigMigrationResolver$Companion;", "", "Landroidx/datastore/preferences/core/Preferences$Key;", "", "requireRemoteConfigFetch", "Landroidx/datastore/preferences/core/Preferences$Key;", "requireHomeConfigFetch", "onboarding_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
    }
}
