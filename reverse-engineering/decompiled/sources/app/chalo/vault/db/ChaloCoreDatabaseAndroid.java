package app.chalo.vault.db;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Looper;
import androidx.media3.extractor.ts.PsExtractor;
import app.cash.sqldelight.driver.android.AndroidSqliteDriver;
import app.chalo.crashlytics.CrashlyticsLogger;
import app.chalo.security.encryption.utils.VaultEncryptionKeyUtils;
import app.chalo.vault.chalo_vault;
import app.chalo.vault.vault.chalo_vaultImpl;
import com.adjust.sdk.Constants;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import net.zetetic.database.sqlcipher.SupportOpenHelperFactory;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/vault/db/ChaloCoreDatabaseAndroid;", "Lapp/chalo/vault/db/ChaloCoreDatabase;", "vault_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ChaloCoreDatabaseAndroid extends ChaloCoreDatabase {
    public final Context b;
    public final VaultEncryptionKeyUtils c;
    public final CrashlyticsLogger d;

    public ChaloCoreDatabaseAndroid(Context context, VaultEncryptionKeyUtils vaultEncryptionKeyUtils, CrashlyticsLogger crashlyticsLogger) {
        this.b = context;
        this.c = vaultEncryptionKeyUtils;
        this.d = crashlyticsLogger;
    }

    @Override // app.chalo.vault.db.ChaloCoreDatabase
    public final AndroidSqliteDriver b() {
        char[] charArray = this.c.a().toCharArray();
        Intrinsics.h(charArray, "toCharArray(...)");
        ByteBuffer byteBufferEncode = Charset.forName(Constants.ENCODING).encode(CharBuffer.wrap(charArray));
        byte[] bArr = new byte[byteBufferEncode.limit()];
        byteBufferEncode.get(bArr);
        SupportOpenHelperFactory supportOpenHelperFactory = new SupportOpenHelperFactory(bArr, null, false);
        Reflection.a(chalo_vault.class);
        return new AndroidSqliteDriver(chalo_vaultImpl.Schema.f10767a, this.b, "chalo_vault", supportOpenHelperFactory, PsExtractor.VIDEO_STREAM_MASK);
    }

    @Override // app.chalo.vault.db.ChaloCoreDatabase
    public final void c() {
        this.b.deleteDatabase("chalo_vault");
    }

    @Override // app.chalo.vault.db.ChaloCoreDatabase
    public final void d() {
        Object systemService = this.b.getSystemService("activity");
        Intrinsics.g(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
        ((ActivityManager) systemService).clearApplicationUserData();
        System.exit(0);
        throw new RuntimeException("System.exit returned normally, while it was supposed to halt JVM.");
    }

    @Override // app.chalo.vault.db.ChaloCoreDatabase
    public final void h() {
        Looper mainLooper = Looper.getMainLooper();
        if (mainLooper != null && mainLooper.isCurrentThread()) {
            this.d.i(new LoadCipherFromMainException());
        }
        System.loadLibrary("sqlcipher");
    }
}
