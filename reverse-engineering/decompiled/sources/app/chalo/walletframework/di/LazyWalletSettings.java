package app.chalo.walletframework.di;

import com.russhwolf.settings.Settings;
import defpackage.gd0;
import defpackage.p01;
import java.util.Set;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/walletframework/di/LazyWalletSettings;", "Lcom/russhwolf/settings/Settings;", "framework-wallet_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class LazyWalletSettings implements Settings {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p01 f10910a;
    public final Object b = LazyKt.a(LazyThreadSafetyMode.SYNCHRONIZED, new gd0(this, 3));

    public LazyWalletSettings(p01 p01Var) {
        this.f10910a = p01Var;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final Settings a() {
        return (Settings) this.b.getValue();
    }

    @Override // com.russhwolf.settings.Settings
    public final void clear() {
        a().clear();
    }

    @Override // com.russhwolf.settings.Settings
    public final Set getKeys() {
        return a().getKeys();
    }

    @Override // com.russhwolf.settings.Settings
    public final long getLong(String key, long j) {
        Intrinsics.i(key, "key");
        return a().getLong(key, -1L);
    }

    @Override // com.russhwolf.settings.Settings
    public final String getString(String key, String str) {
        Intrinsics.i(key, "key");
        return a().getString(key, "WALLET_FETCH_PENDING");
    }

    @Override // com.russhwolf.settings.Settings
    public final void putLong(String key, long j) {
        Intrinsics.i(key, "key");
        a().putLong(key, j);
    }

    @Override // com.russhwolf.settings.Settings
    public final void putString(String key, String value) {
        Intrinsics.i(key, "key");
        Intrinsics.i(value, "value");
        a().putString(key, value);
    }
}
