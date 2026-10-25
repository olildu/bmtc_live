package app.chalo.instantticket.ui.faredetails.compose;

import androidx.compose.runtime.MutableState;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.media3.extractor.WavUtil;
import defpackage.vo1;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.instantticket.ui.faredetails.compose.FareDetailsCTAViewKt$FareDetailsFareNote$1$1", f = "FareDetailsCTAView.kt", l = {}, m = "invokeSuspend", v = 1)
final class FareDetailsCTAViewKt$FareDetailsFareNote$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $fareNote;
    final /* synthetic */ MutableState<AnnotatedString> $finalText$delegate;
    final /* synthetic */ MutableState<Boolean> $isClickable$delegate;
    final /* synthetic */ int $minimizedMaxLines;
    final /* synthetic */ String $readMore;
    final /* synthetic */ long $readMoreColor;
    final /* synthetic */ long $textColor;
    final /* synthetic */ TextLayoutResult $textLayoutResult;
    final /* synthetic */ TextStyle $textStyle;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FareDetailsCTAViewKt$FareDetailsFareNote$1$1(TextLayoutResult textLayoutResult, int i, String str, String str2, TextStyle textStyle, long j, long j2, MutableState mutableState, MutableState mutableState2, Continuation continuation) {
        super(2, continuation);
        this.$textLayoutResult = textLayoutResult;
        this.$minimizedMaxLines = i;
        this.$readMore = str;
        this.$fareNote = str2;
        this.$textStyle = textStyle;
        this.$textColor = j;
        this.$readMoreColor = j2;
        this.$finalText$delegate = mutableState;
        this.$isClickable$delegate = mutableState2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new FareDetailsCTAViewKt$FareDetailsFareNote$1$1(this.$textLayoutResult, this.$minimizedMaxLines, this.$readMore, this.$fareNote, this.$textStyle, this.$textColor, this.$readMoreColor, this.$finalText$delegate, this.$isClickable$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((FareDetailsCTAViewKt$FareDetailsFareNote$1$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String strSubstring;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.b(obj);
        TextLayoutResult textLayoutResult = this.$textLayoutResult;
        Unit unit = Unit.f17538a;
        if (textLayoutResult != null && textLayoutResult.getHasVisualOverflow()) {
            int lineEnd$default = TextLayoutResult.getLineEnd$default(this.$textLayoutResult, this.$minimizedMaxLines - 1, false, 2, null);
            String strM = vo1.m("... ", this.$readMore);
            String strSubstring2 = this.$fareNote.substring(0, lineEnd$default);
            Intrinsics.h(strSubstring2, "substring(...)");
            String strS = StringsKt.s(strM.length(), strSubstring2);
            int iZ = StringsKt.z(strS);
            while (true) {
                if (-1 >= iZ) {
                    strSubstring = "";
                    break;
                }
                char cCharAt = strS.charAt(iZ);
                if (cCharAt != ' ' && cCharAt != '.') {
                    strSubstring = strS.substring(0, iZ + 1);
                    Intrinsics.h(strSubstring, "substring(...)");
                    break;
                }
                iZ--;
            }
            MutableState<AnnotatedString> mutableState = this.$finalText$delegate;
            TextStyle textStyle = this.$textStyle;
            long j = this.$textColor;
            long j2 = this.$readMoreColor;
            AnnotatedString.Builder builder = new AnnotatedString.Builder(0, 1, null);
            int iPushStyle = builder.pushStyle(SpanStyle.m6672copyGSF8kmg$default(textStyle.toSpanStyle(), j, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, null, WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE, null));
            try {
                builder.append(strSubstring);
                builder.pop(iPushStyle);
                int iPushStyle2 = builder.pushStyle(SpanStyle.m6672copyGSF8kmg$default(textStyle.toSpanStyle(), j2, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, null, WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE, null));
                try {
                    builder.append(strM);
                    builder.pop(iPushStyle2);
                    mutableState.setValue(builder.toAnnotatedString());
                    this.$isClickable$delegate.setValue(Boolean.TRUE);
                } catch (Throwable th) {
                    builder.pop(iPushStyle2);
                    throw th;
                }
            } catch (Throwable th2) {
                builder.pop(iPushStyle);
                throw th2;
            }
        }
        return unit;
    }
}
