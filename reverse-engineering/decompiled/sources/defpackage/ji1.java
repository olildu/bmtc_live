package defpackage;

import android.adservices.topics.TopicsManager;
import android.net.Uri;
import android.text.Editable;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.text.TextInclusionStrategy;
import androidx.constraintlayout.core.state.Interpolator;
import androidx.constraintlayout.core.state.Transition;
import androidx.media3.extractor.Extractor;
import androidx.media3.extractor.ExtractorsFactory;
import androidx.media3.extractor.text.SubtitleParser;
import androidx.media3.extractor.ts.TsExtractor;
import androidx.media3.extractor.wav.WavExtractor;
import com.google.android.datatransport.TransportScheduleCallback;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.material.textfield.TextInputLayout;
import com.thoughtnudge.sdk.ThoughtNudge;
import java.io.InputStream;
import java.util.Map;
import org.apache.commons.io.input.UnsynchronizedByteArrayInputStream;
import org.apache.commons.io.output.AbstractByteArrayOutputStream;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ji1 implements TextInclusionStrategy, TextInputLayout.LengthCounter, OnCompleteListener, Interpolator, TransportScheduleCallback, ExtractorsFactory, AbstractByteArrayOutputStream.InputStreamConstructor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17410a;

    public /* synthetic */ ji1(int i) {
        this.f17410a = i;
    }

    public static /* bridge */ /* synthetic */ TopicsManager d(Object obj) {
        return (TopicsManager) obj;
    }

    public static /* bridge */ /* synthetic */ Class f() {
        return TopicsManager.class;
    }

    @Override // com.google.android.material.textfield.TextInputLayout.LengthCounter
    public int a(Editable editable) {
        int i = TextInputLayout.C0;
        if (editable != null) {
            return editable.length();
        }
        return 0;
    }

    @Override // org.apache.commons.io.output.AbstractByteArrayOutputStream.InputStreamConstructor
    public InputStream construct(byte[] bArr, int i, int i2) {
        return new UnsynchronizedByteArrayInputStream(bArr, i, i2);
    }

    @Override // androidx.media3.extractor.ExtractorsFactory
    public Extractor[] createExtractors() {
        switch (this.f17410a) {
            case 16:
                return TsExtractor.lambda$static$1();
            default:
                return WavExtractor.lambda$static$0();
        }
    }

    @Override // androidx.media3.extractor.ExtractorsFactory
    public /* synthetic */ ExtractorsFactory experimentalSetTextTrackTranscodingEnabled(boolean z) {
        int i = this.f17410a;
        return q20.b(this, z);
    }

    @Override // androidx.constraintlayout.core.state.Interpolator
    public float getInterpolation(float f) {
        switch (this.f17410a) {
            case 8:
                return Transition.lambda$getInterpolator$1(f);
            case 9:
                return Transition.lambda$getInterpolator$2(f);
            case 10:
                return Transition.lambda$getInterpolator$3(f);
            case 11:
                return Transition.lambda$getInterpolator$4(f);
            case 12:
                return Transition.lambda$getInterpolator$5(f);
            case 13:
                return Transition.lambda$getInterpolator$6(f);
            default:
                return Transition.lambda$getInterpolator$7(f);
        }
    }

    @Override // androidx.compose.ui.text.TextInclusionStrategy
    public boolean isIncluded(Rect rect, Rect rect2) {
        switch (this.f17410a) {
            case 0:
                return rect.overlaps(rect2);
            case 1:
                return TextInclusionStrategy.Companion.ContainsAll$lambda$0(rect, rect2);
            default:
                return TextInclusionStrategy.Companion.ContainsCenter$lambda$0(rect, rect2);
        }
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        ThoughtNudge.refreshToken$lambda$4(task);
    }

    @Override // androidx.media3.extractor.ExtractorsFactory
    /* JADX INFO: renamed from: setSubtitleParserFactory */
    public /* synthetic */ ExtractorsFactory mo7941setSubtitleParserFactory(SubtitleParser.Factory factory) {
        int i = this.f17410a;
        return q20.c(this, factory);
    }

    @Override // androidx.media3.extractor.ExtractorsFactory
    public /* synthetic */ Extractor[] createExtractors(Uri uri, Map map) {
        int i = this.f17410a;
        return q20.a(this, uri, map);
    }

    @Override // com.google.android.datatransport.TransportScheduleCallback
    public void b(Exception exc) {
    }
}
