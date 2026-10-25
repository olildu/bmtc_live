package app.chalo.walletframework.wallet.data.local.walletencryptedsharedprefs;

import androidx.datastore.core.DataStore;
import app.chalo.providers.CoroutineContextProvider;
import app.chalo.walletframework.wallet.data.model.NoWalletStatus;
import com.russhwolf.settings.Settings;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lapp/chalo/walletframework/wallet/data/local/walletencryptedsharedprefs/WalletEncryptedSharedPrefsSettings;", "Lapp/chalo/walletframework/wallet/data/local/walletencryptedsharedprefs/WalletEncryptedSharedPrefs;", "Companion", "framework-wallet_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class WalletEncryptedSharedPrefsSettings implements WalletEncryptedSharedPrefs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Settings f10953a;
    public final DataStore b;

    /* JADX INFO: renamed from: app.chalo.walletframework.wallet.data.local.walletencryptedsharedprefs.WalletEncryptedSharedPrefsSettings$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "app.chalo.walletframework.wallet.data.local.walletencryptedsharedprefs.WalletEncryptedSharedPrefsSettings$1", f = "WalletEncryptedSharedPrefsSettings.kt", l = {22}, m = "invokeSuspend", v = 1)
    final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        public AnonymousClass1(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return WalletEncryptedSharedPrefsSettings.this.new AnonymousClass1(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                ResultKt.b(obj);
                Flow data = WalletEncryptedSharedPrefsSettings.this.b.getData();
                this.label = 1;
                obj = FlowKt.v(data, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
            }
            if (obj == null) {
                WalletEncryptedSharedPrefsSettings.this.f10953a.clear();
            }
            return Unit.f17538a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0004¨\u0006\t"}, d2 = {"Lapp/chalo/walletframework/wallet/data/local/walletencryptedsharedprefs/WalletEncryptedSharedPrefsSettings$Companion;", "", "", "ENCRYPTED_WALLET_DATABASE_NAME", "Ljava/lang/String;", "ENCRYPTED_WALLET_SETTINGS_NAME", "OLDEST_CACHED_AT_TIME_STAMP", "LATEST_SYNCED_AT_TIME_STAMP", "NO_WALLET_STATUS", "framework-wallet_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
    }

    public WalletEncryptedSharedPrefsSettings(Settings settings, DataStore dataStore, CoroutineContextProvider coroutineContextProvider) {
        this.f10953a = settings;
        this.b = dataStore;
        BuildersKt.d(CoroutineScopeKt.a(coroutineContextProvider.b()), null, null, new AnonymousClass1(null), 3);
    }

    public static String h(NoWalletStatusRequest noWalletStatusRequest) {
        if (noWalletStatusRequest instanceof NoWalletStatusRequest.ClosedLoopWallet) {
            String lowerCase = ((NoWalletStatusRequest.ClosedLoopWallet) noWalletStatusRequest).f10950a.toLowerCase(Locale.ROOT);
            Intrinsics.h(lowerCase, "toLowerCase(...)");
            return "noWalletStatus_CLOSED_".concat(lowerCase);
        }
        if (Intrinsics.d(noWalletStatusRequest, NoWalletStatusRequest.SemiClosedWallet.f10952a)) {
            return "noWalletStatus";
        }
        throw new NoWhenBranchMatchedException();
    }

    public static String i(String str, String str2, String str3) {
        return str + "_" + str2 + "_" + str3;
    }

    @Override // app.chalo.walletframework.wallet.data.local.walletencryptedsharedprefs.WalletEncryptedSharedPrefs
    public final Long a(String str, String str2) {
        return new Long(this.f10953a.getLong(i(str, str2, "oldestCachedAtTimeStamp"), -1L));
    }

    @Override // app.chalo.walletframework.wallet.data.local.walletencryptedsharedprefs.WalletEncryptedSharedPrefs
    public final NoWalletStatus b(NoWalletStatusRequest noWalletStatusRequest) {
        return NoWalletStatus.valueOf(this.f10953a.getString(h(noWalletStatusRequest), "WALLET_FETCH_PENDING"));
    }

    @Override // app.chalo.walletframework.wallet.data.local.walletencryptedsharedprefs.WalletEncryptedSharedPrefs
    public final void c(NoWalletStatusRequest noWalletStatusRequest, NoWalletStatus noWalletStatus) {
        this.f10953a.putString(h(noWalletStatusRequest), noWalletStatus.name());
    }

    @Override // app.chalo.walletframework.wallet.data.local.walletencryptedsharedprefs.WalletEncryptedSharedPrefs
    public final void d(NoWalletStatus noWalletStatus) {
        int i;
        Settings settings = this.f10953a;
        Set keys = settings.getKeys();
        ArrayList arrayList = new ArrayList();
        Iterator it = keys.iterator();
        while (true) {
            i = 0;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (StringsKt.a0((String) next, "noWalletStatus", false)) {
                arrayList.add(next);
            }
        }
        int size = arrayList.size();
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            settings.putString((String) obj, noWalletStatus.name());
        }
    }

    @Override // app.chalo.walletframework.wallet.data.local.walletencryptedsharedprefs.WalletEncryptedSharedPrefs
    public final void e(long j, String str, String str2) {
        this.f10953a.putLong(i(str, str2, "oldestCachedAtTimeStamp"), j);
    }

    @Override // app.chalo.walletframework.wallet.data.local.walletencryptedsharedprefs.WalletEncryptedSharedPrefs
    public final Long f(String str, String str2) {
        return new Long(this.f10953a.getLong(i(str, str2, "latestSyncedAtTimeStamp"), -1L));
    }

    @Override // app.chalo.walletframework.wallet.data.local.walletencryptedsharedprefs.WalletEncryptedSharedPrefs
    public final void g(long j, String str, String str2) {
        this.f10953a.putLong(i(str, str2, "latestSyncedAtTimeStamp"), j);
    }
}
