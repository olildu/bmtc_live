package app.chalo.data;

import androidx.compose.material3.internal.CalendarModelKt;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.media3.exoplayer.audio.SilenceSkippingAudioProcessor;
import androidx.work.PeriodicWorkRequest;
import defpackage.gp1;
import defpackage.xs;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lapp/chalo/data/WalletSetupConfiguration;", "", "Companion", "$serializer", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class WalletSetupConfiguration {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] h = {null, null, null, null, null, null, LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new gp1(2))};
    public static final long i = PeriodicWorkRequest.MIN_PERIODIC_INTERVAL_MILLIS;
    public static final List j = CollectionsKt.S(1000, 5000, Integer.valueOf(AccessibilityNodeInfoCompat.EXTRA_DATA_TEXT_CHARACTER_LOCATION_ARG_MAX_LENGTH));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WalletEnableConfig f2412a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final long f;
    public final List g;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0007\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lapp/chalo/data/WalletSetupConfiguration$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/data/WalletSetupConfiguration;", "serializer", "()Lkotlinx/serialization/KSerializer;", "", "DEFAULT_MAX_QUICK_PAY_AMOUNT", "J", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<WalletSetupConfiguration> serializer() {
            return WalletSetupConfiguration$$serializer.f2413a;
        }
    }

    public /* synthetic */ WalletSetupConfiguration(int i2, WalletEnableConfig walletEnableConfig, long j2, long j3, long j4, long j5, long j6, List list) {
        this.f2412a = (i2 & 1) == 0 ? new WalletEnableConfig() : walletEnableConfig;
        if ((i2 & 2) == 0) {
            this.b = CalendarModelKt.MillisecondsIn24Hours;
        } else {
            this.b = j2;
        }
        if ((i2 & 4) == 0) {
            this.c = CalendarModelKt.MillisecondsIn24Hours;
        } else {
            this.c = j3;
        }
        if ((i2 & 8) == 0) {
            this.d = CalendarModelKt.MillisecondsIn24Hours;
        } else {
            this.d = j4;
        }
        if ((i2 & 16) == 0) {
            this.e = SilenceSkippingAudioProcessor.DEFAULT_MINIMUM_SILENCE_DURATION_US;
        } else {
            this.e = j5;
        }
        if ((i2 & 32) == 0) {
            this.f = i;
        } else {
            this.f = j6;
        }
        if ((i2 & 64) == 0) {
            this.g = j;
        } else {
            this.g = list;
        }
    }

    public final boolean a() {
        WalletEnableConfig walletEnableConfig = this.f2412a;
        return walletEnableConfig.b || WalletSetupConfigurationKt.a(walletEnableConfig);
    }

    public final boolean b() {
        WalletEnableConfig walletEnableConfig = this.f2412a;
        return walletEnableConfig.f2410a || WalletSetupConfigurationKt.a(walletEnableConfig);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WalletSetupConfiguration)) {
            return false;
        }
        WalletSetupConfiguration walletSetupConfiguration = (WalletSetupConfiguration) obj;
        return Intrinsics.d(this.f2412a, walletSetupConfiguration.f2412a) && this.b == walletSetupConfiguration.b && this.c == walletSetupConfiguration.c && this.d == walletSetupConfiguration.d && this.e == walletSetupConfiguration.e && this.f == walletSetupConfiguration.f && Intrinsics.d(this.g, walletSetupConfiguration.g);
    }

    public final int hashCode() {
        int iHashCode = this.f2412a.hashCode() * 31;
        long j2 = this.b;
        int i2 = (iHashCode + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        long j3 = this.c;
        int i3 = (i2 + ((int) (j3 ^ (j3 >>> 32)))) * 31;
        long j4 = this.d;
        int i4 = (i3 + ((int) (j4 ^ (j4 >>> 32)))) * 31;
        long j5 = this.e;
        int i5 = (i4 + ((int) (j5 ^ (j5 >>> 32)))) * 31;
        long j6 = this.f;
        return this.g.hashCode() + ((i5 + ((int) (j6 ^ (j6 >>> 32)))) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WalletSetupConfiguration(enableConfig=");
        sb.append(this.f2412a);
        sb.append(", reclaimDuration=");
        sb.append(this.b);
        xs.r(this.c, ", timeoutDuration=", ", periodicSyncInterval=", sb);
        sb.append(this.d);
        xs.r(this.e, ", maxQuickPayAmount=", ", quickPayActivationWindow=", sb);
        sb.append(this.f);
        sb.append(", suggestedDenominations=");
        sb.append(this.g);
        sb.append(")");
        return sb.toString();
    }

    public WalletSetupConfiguration(WalletEnableConfig walletEnableConfig, long j2, long j3, long j4, long j5, long j6, List suggestedDenominations) {
        Intrinsics.i(suggestedDenominations, "suggestedDenominations");
        this.f2412a = walletEnableConfig;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = j5;
        this.f = j6;
        this.g = suggestedDenominations;
    }
}
