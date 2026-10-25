package defpackage;

import android.adservices.adselection.AdSelectionManager;
import android.adservices.adselection.AdSelectionOutcome;
import android.net.Uri;
import androidx.media3.extractor.Extractor;
import androidx.media3.extractor.ExtractorsFactory;
import androidx.media3.extractor.text.SubtitleParser;
import androidx.media3.extractor.ts.Ac3Extractor;
import androidx.media3.extractor.ts.Ac4Extractor;
import androidx.media3.extractor.ts.AdtsExtractor;
import com.adjust.sdk.OnDeferredDeeplinkResponseListener;
import com.google.crypto.tink.Key;
import com.google.crypto.tink.internal.ParametersParser;
import com.google.crypto.tink.internal.ParametersSerializer;
import com.google.crypto.tink.internal.PrimitiveConstructor;
import com.google.crypto.tink.mac.internal.ChunkedAesCmacImpl;
import java.security.GeneralSecurityException;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class p implements ExtractorsFactory, OnDeferredDeeplinkResponseListener, PrimitiveConstructor.PrimitiveConstructionFunction, ParametersSerializer.ParametersSerializationFunction, ParametersParser.ParametersParsingFunction {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18990a;

    public /* synthetic */ p(int i) {
        this.f18990a = i;
    }

    public static /* bridge */ /* synthetic */ AdSelectionManager a(Object obj) {
        return (AdSelectionManager) obj;
    }

    public static /* bridge */ /* synthetic */ AdSelectionOutcome c(Object obj) {
        return (AdSelectionOutcome) obj;
    }

    @Override // com.google.crypto.tink.internal.PrimitiveConstructor.PrimitiveConstructionFunction
    public Object b(Key key) throws GeneralSecurityException {
        ChunkedAesCmacImpl chunkedAesCmacImpl = new ChunkedAesCmacImpl();
        if (ChunkedAesCmacImpl.f14236a.isCompatible()) {
            return chunkedAesCmacImpl;
        }
        throw new GeneralSecurityException("Can not use AES-CMAC in FIPS-mode.");
    }

    @Override // androidx.media3.extractor.ExtractorsFactory
    public Extractor[] createExtractors() {
        switch (this.f18990a) {
            case 0:
                return Ac3Extractor.lambda$static$0();
            case 1:
                return Ac4Extractor.lambda$static$0();
            default:
                return AdtsExtractor.lambda$static$0();
        }
    }

    @Override // androidx.media3.extractor.ExtractorsFactory
    public /* synthetic */ ExtractorsFactory experimentalSetTextTrackTranscodingEnabled(boolean z) {
        int i = this.f18990a;
        return q20.b(this, z);
    }

    @Override // com.adjust.sdk.OnDeferredDeeplinkResponseListener
    public boolean launchReceivedDeeplink(Uri uri) {
        return Boolean.TRUE.booleanValue();
    }

    @Override // androidx.media3.extractor.ExtractorsFactory
    /* JADX INFO: renamed from: setSubtitleParserFactory */
    public /* synthetic */ ExtractorsFactory mo7941setSubtitleParserFactory(SubtitleParser.Factory factory) {
        int i = this.f18990a;
        return q20.c(this, factory);
    }

    @Override // androidx.media3.extractor.ExtractorsFactory
    public /* synthetic */ Extractor[] createExtractors(Uri uri, Map map) {
        int i = this.f18990a;
        return q20.a(this, uri, map);
    }
}
