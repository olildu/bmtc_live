package app.chalo.domain;

import androidx.compose.material3.internal.CalendarModelKt;
import androidx.media3.exoplayer.audio.SilenceSkippingAudioProcessor;
import app.chalo.contract.BasicInfoContract;
import app.chalo.crashlytics.CrashlyticsLogger;
import app.chalo.data.WalletEnableConfig;
import app.chalo.data.WalletSetupConfiguration;
import app.chalo.features.chaloconfig.ChaloConfigFeature;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/domain/GetWalletSetupConfigurationUseCase;", "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class GetWalletSetupConfigurationUseCase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChaloConfigFeature f2502a;
    public final CrashlyticsLogger b;
    public final EvaluateWalletEnableConfigUseCase c;
    public final BasicInfoContract d;

    public GetWalletSetupConfigurationUseCase(ChaloConfigFeature chaloConfigFeature, CrashlyticsLogger crashlyticsLogger, EvaluateWalletEnableConfigUseCase evaluateWalletEnableConfigUseCase, BasicInfoContract basicInfoContract) {
        this.f2502a = chaloConfigFeature;
        this.b = crashlyticsLogger;
        this.c = evaluateWalletEnableConfigUseCase;
        this.d = basicInfoContract;
    }

    public static WalletSetupConfiguration a() {
        return new WalletSetupConfiguration(new WalletEnableConfig(), CalendarModelKt.MillisecondsIn24Hours, CalendarModelKt.MillisecondsIn24Hours, CalendarModelKt.MillisecondsIn24Hours, SilenceSkippingAudioProcessor.DEFAULT_MINIMUM_SILENCE_DURATION_US, WalletSetupConfiguration.i, WalletSetupConfiguration.j);
    }

    /* JADX WARN: Code duplicated, block: B:43:0x009c  */
    /* JADX WARN: Code duplicated, block: B:52:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:69:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:78:0x0121 A[Catch: Exception -> 0x002e, TryCatch #1 {Exception -> 0x002e, blocks: (B:12:0x002a, B:31:0x0065, B:33:0x0069, B:35:0x006e, B:37:0x0087, B:38:0x008b, B:42:0x0097, B:44:0x009d, B:46:0x00a8, B:47:0x00ac, B:51:0x00b8, B:53:0x00c0, B:55:0x00cb, B:56:0x00cf, B:60:0x00db, B:61:0x00df, B:63:0x00e9, B:64:0x00ed, B:68:0x00f9, B:70:0x0101, B:72:0x010c, B:73:0x0110, B:77:0x011c, B:79:0x0128, B:81:0x0133, B:82:0x0137, B:84:0x013e, B:86:0x0147, B:88:0x0155, B:89:0x0158, B:92:0x016b, B:91:0x015d, B:78:0x0121, B:18:0x0039, B:27:0x0056, B:21:0x0040, B:24:0x004a, B:28:0x0059), top: B:101:0x0024 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0062, code lost:
    
        if (r0 == r3) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(kotlin.coroutines.jvm.internal.ContinuationImpl r19) {
        /*
            Method dump skipped, instruction units count: 401
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.domain.GetWalletSetupConfigurationUseCase.b(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
