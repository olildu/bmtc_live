package defpackage;

import android.net.Uri;
import android.net.http.HttpEngine;
import android.os.LocaleList;
import android.view.inputmethod.DeleteGesture;
import android.view.inputmethod.RemoveSpaceGesture;
import android.view.inputmethod.SelectGesture;
import android.view.inputmethod.SelectRangeGesture;
import androidx.compose.runtime.ShouldPauseCallback;
import androidx.compose.ui.layout.LayoutNodeSubcompositionsState;
import androidx.media3.common.MediaItem;
import androidx.media3.exoplayer.ima.ImaServerSideAdInsertionMediaSource;
import androidx.media3.extractor.Extractor;
import androidx.media3.extractor.ExtractorsFactory;
import androidx.media3.extractor.metadata.id3.Id3Decoder;
import androidx.media3.extractor.mkv.MatroskaExtractor;
import androidx.media3.extractor.text.SubtitleParser;
import com.google.android.material.carousel.MaskableFrameLayout;
import com.google.android.material.shape.AbsoluteCornerSize;
import com.google.android.material.shape.ClampedCornerSize;
import com.google.android.material.shape.CornerSize;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.crypto.tink.Key;
import com.google.crypto.tink.internal.PrimitiveConstructor;
import com.google.crypto.tink.mac.internal.ChunkedHmacImpl;
import java.security.GeneralSecurityException;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import org.apache.commons.io.function.IOConsumer;
import org.apache.commons.io.function.IOFunction;
import org.apache.commons.io.function.IOSupplier;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d70 implements PrimitiveConstructor.PrimitiveConstructionFunction, IOFunction, Id3Decoder.FramePredicate, ImaServerSideAdInsertionMediaSource.StreamEventListener, ShouldPauseCallback, ShapeAppearanceModel.CornerSizeUnaryOperator, ExtractorsFactory {
    public static /* bridge */ /* synthetic */ HttpEngine c(Object obj) {
        return (HttpEngine) obj;
    }

    public static /* bridge */ /* synthetic */ LocaleList d(Object obj) {
        return (LocaleList) obj;
    }

    public static /* bridge */ /* synthetic */ DeleteGesture e(Object obj) {
        return (DeleteGesture) obj;
    }

    public static /* bridge */ /* synthetic */ RemoveSpaceGesture f(Object obj) {
        return (RemoveSpaceGesture) obj;
    }

    public static /* bridge */ /* synthetic */ SelectGesture g(Object obj) {
        return (SelectGesture) obj;
    }

    public static /* bridge */ /* synthetic */ SelectRangeGesture h(Object obj) {
        return (SelectRangeGesture) obj;
    }

    public static /* bridge */ /* synthetic */ boolean k(Object obj) {
        return obj instanceof DeleteGesture;
    }

    public static /* bridge */ /* synthetic */ boolean l(Object obj) {
        return obj instanceof SelectRangeGesture;
    }

    @Override // com.google.android.material.shape.ShapeAppearanceModel.CornerSizeUnaryOperator
    public CornerSize a(CornerSize cornerSize) {
        int i = MaskableFrameLayout.d;
        return cornerSize instanceof AbsoluteCornerSize ? new ClampedCornerSize(((AbsoluteCornerSize) cornerSize).f13376a) : cornerSize;
    }

    @Override // org.apache.commons.io.function.IOFunction
    public /* synthetic */ IOConsumer andThen(Consumer consumer) {
        return r90.a(this, consumer);
    }

    @Override // org.apache.commons.io.function.IOFunction
    public Object apply(Object obj) {
        return r90.r(obj);
    }

    @Override // com.google.crypto.tink.internal.PrimitiveConstructor.PrimitiveConstructionFunction
    public Object b(Key key) throws GeneralSecurityException {
        ChunkedHmacImpl chunkedHmacImpl = new ChunkedHmacImpl();
        if (ChunkedHmacImpl.f14237a.isCompatible()) {
            return chunkedHmacImpl;
        }
        throw new GeneralSecurityException("Can not use HMAC in FIPS-mode, as BoringCrypto module is not available.");
    }

    @Override // org.apache.commons.io.function.IOFunction
    public /* synthetic */ IOFunction compose(Function function) {
        return r90.e(this, function);
    }

    @Override // androidx.media3.extractor.ExtractorsFactory
    public Extractor[] createExtractors() {
        return MatroskaExtractor.lambda$static$1();
    }

    @Override // androidx.media3.extractor.metadata.id3.Id3Decoder.FramePredicate
    public boolean evaluate(int i, int i2, int i3, int i4, int i5) {
        return Id3Decoder.lambda$static$0(i, i2, i3, i4, i5);
    }

    @Override // androidx.media3.extractor.ExtractorsFactory
    public /* synthetic */ ExtractorsFactory experimentalSetTextTrackTranscodingEnabled(boolean z) {
        return q20.b(this, z);
    }

    @Override // androidx.media3.exoplayer.ima.ImaServerSideAdInsertionMediaSource.StreamEventListener
    public void onStreamIdChanged(MediaItem mediaItem, String str) {
        ImaServerSideAdInsertionMediaSource.AdsLoader.Builder.lambda$new$0(mediaItem, str);
    }

    @Override // androidx.media3.extractor.ExtractorsFactory
    /* JADX INFO: renamed from: setSubtitleParserFactory */
    public /* synthetic */ ExtractorsFactory mo7941setSubtitleParserFactory(SubtitleParser.Factory factory) {
        return q20.c(this, factory);
    }

    @Override // androidx.compose.runtime.ShouldPauseCallback
    public boolean shouldPause() {
        return LayoutNodeSubcompositionsState.applyPausedPrecomposition$lambda$0$0$0();
    }

    @Override // org.apache.commons.io.function.IOFunction
    public /* synthetic */ IOConsumer andThen(IOConsumer iOConsumer) {
        return r90.b(this, iOConsumer);
    }

    @Override // org.apache.commons.io.function.IOFunction
    public /* synthetic */ IOFunction compose(IOFunction iOFunction) {
        return r90.f(this, iOFunction);
    }

    @Override // androidx.media3.extractor.ExtractorsFactory
    public /* synthetic */ Extractor[] createExtractors(Uri uri, Map map) {
        return q20.a(this, uri, map);
    }

    @Override // org.apache.commons.io.function.IOFunction
    public /* synthetic */ IOFunction andThen(Function function) {
        return r90.c(this, function);
    }

    @Override // org.apache.commons.io.function.IOFunction
    public /* synthetic */ IOSupplier compose(Supplier supplier) {
        return r90.g(this, supplier);
    }

    @Override // org.apache.commons.io.function.IOFunction
    public /* synthetic */ IOFunction andThen(IOFunction iOFunction) {
        return r90.d(this, iOFunction);
    }

    @Override // org.apache.commons.io.function.IOFunction
    public /* synthetic */ IOSupplier compose(IOSupplier iOSupplier) {
        return r90.h(this, iOSupplier);
    }
}
