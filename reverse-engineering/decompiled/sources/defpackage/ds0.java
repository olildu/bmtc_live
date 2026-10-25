package defpackage;

import android.app.RemoteAction;
import android.content.pm.ShortcutInfo;
import android.content.pm.ShortcutManager;
import android.graphics.ColorSpace;
import android.net.Uri;
import android.os.ProfilingManager;
import android.text.PrecomputedText;
import android.view.textclassifier.TextClassifier;
import androidx.compose.ui.graphics.colorspace.DoubleFunction;
import androidx.compose.ui.graphics.colorspace.Rgb;
import androidx.media3.common.Player;
import androidx.media3.common.util.ListenerSet;
import androidx.media3.extractor.Extractor;
import androidx.media3.extractor.ExtractorsFactory;
import androidx.media3.extractor.text.SubtitleParser;
import androidx.media3.extractor.ts.PsExtractor;
import com.google.android.gms.tasks.OnFailureListener;
import in.juspay.hyperqr.QRCodeAnalyzer;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class ds0 implements ExtractorsFactory, OnFailureListener, DoubleFunction, ListenerSet.Event {
    public static /* bridge */ /* synthetic */ RemoteAction a(Object obj) {
        return (RemoteAction) obj;
    }

    public static /* bridge */ /* synthetic */ ShortcutInfo b(Object obj) {
        return (ShortcutInfo) obj;
    }

    public static /* bridge */ /* synthetic */ ShortcutManager c(Object obj) {
        return (ShortcutManager) obj;
    }

    public static /* bridge */ /* synthetic */ ColorSpace d(Object obj) {
        return (ColorSpace) obj;
    }

    public static /* bridge */ /* synthetic */ ProfilingManager e(Object obj) {
        return (ProfilingManager) obj;
    }

    public static /* bridge */ /* synthetic */ TextClassifier f(Object obj) {
        return (TextClassifier) obj;
    }

    public static /* bridge */ /* synthetic */ Class g() {
        return ProfilingManager.class;
    }

    public static /* bridge */ /* synthetic */ boolean j(Object obj) {
        return obj instanceof PrecomputedText;
    }

    public static /* bridge */ /* synthetic */ Class k() {
        return ShortcutManager.class;
    }

    @Override // androidx.media3.extractor.ExtractorsFactory
    public Extractor[] createExtractors() {
        return PsExtractor.lambda$static$0();
    }

    @Override // androidx.media3.extractor.ExtractorsFactory
    public /* synthetic */ ExtractorsFactory experimentalSetTextTrackTranscodingEnabled(boolean z) {
        return q20.b(this, z);
    }

    @Override // androidx.compose.ui.graphics.colorspace.DoubleFunction
    public double invoke(double d) {
        return Rgb.DoubleIdentity$lambda$0(d);
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception exc) {
        QRCodeAnalyzer.analyze$lambda$1(exc);
    }

    @Override // androidx.media3.extractor.ExtractorsFactory
    /* JADX INFO: renamed from: setSubtitleParserFactory */
    public /* synthetic */ ExtractorsFactory mo7941setSubtitleParserFactory(SubtitleParser.Factory factory) {
        return q20.c(this, factory);
    }

    @Override // androidx.media3.extractor.ExtractorsFactory
    public /* synthetic */ Extractor[] createExtractors(Uri uri, Map map) {
        return q20.a(this, uri, map);
    }

    @Override // androidx.media3.common.util.ListenerSet.Event
    public void invoke(Object obj) {
        ((Player.Listener) obj).onRenderedFirstFrame();
    }
}
