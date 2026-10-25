package defpackage;

import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.input.TransformedText;
import app.chalo.compose.ChaloCardNumberTranslatorKt$chaloCardNumberFilter$chaloCardOffsetTranslator$1;
import app.chalo.instantticket.ui.faredetails.contract.FareDetailsViewState;
import app.chalo.ncmc.ui.entercarddetails.EnterCardDetailsViewState;
import io.ktor.events.EventDefinition;
import io.ktor.util.internal.LockFreeLinkedListHead;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.text.StringsKt;
import kotlinx.coroutines.ExecutorCoroutineDispatcher;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class p10 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18995a;

    public /* synthetic */ p10(int i) {
        this.f18995a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f18995a) {
            case 0:
                return EnterCardDetailsViewState.a((EnterCardDetailsViewState) obj, null, null, null, null, false, false, false, false, false, null, false, 3967);
            case 1:
                return EnterCardDetailsViewState.a((EnterCardDetailsViewState) obj, null, null, null, null, false, false, true, false, false, null, false, 1919);
            case 2:
                return EnterCardDetailsViewState.a((EnterCardDetailsViewState) obj, null, null, null, null, false, false, false, false, false, null, false, 3967);
            case 3:
                return EnterCardDetailsViewState.a((EnterCardDetailsViewState) obj, null, null, null, null, true, false, false, false, false, null, false, 4047);
            case 4:
                return EnterCardDetailsViewState.a((EnterCardDetailsViewState) obj, null, null, null, null, false, false, false, false, false, null, false, 4047);
            case 5:
                AnnotatedString it = (AnnotatedString) obj;
                Intrinsics.i(it, "it");
                int length = it.getText().length();
                String text = it.getText();
                if (length >= 16) {
                    text = StringsKt.c0(text, new IntRange(0, 15, 1));
                }
                int length2 = text.length();
                String strA = "";
                for (int i = 0; i < length2; i++) {
                    strA = strA + text.charAt(i);
                    if (i == 1 || i == 5 || i == 9) {
                        strA = vo1.A(strA, " ");
                    }
                }
                return new TransformedText(new AnnotatedString(strA, null, 2, null), new ChaloCardNumberTranslatorKt$chaloCardNumberFilter$chaloCardOffsetTranslator$1());
            case 6:
                Intrinsics.i((EventDefinition) obj, "it");
                return new LockFreeLinkedListHead();
            case 7:
                CoroutineContext.Element element = (CoroutineContext.Element) obj;
                if (element instanceof ExecutorCoroutineDispatcher) {
                    return (ExecutorCoroutineDispatcher) element;
                }
                return null;
            case 8:
                FareDetailsViewState it2 = (FareDetailsViewState) obj;
                Intrinsics.i(it2, "it");
                return FareDetailsViewState.a(it2, null, null, null, false, true, false, null, null, null, false, false, null, false, null, null, false, null, null, null, null, false, false, null, null, null, false, null, false, null, null, null, null, null, null, -17, 31);
            case 9:
                FareDetailsViewState it3 = (FareDetailsViewState) obj;
                Intrinsics.i(it3, "it");
                return FareDetailsViewState.a(it3, null, null, null, false, false, false, null, null, null, false, false, null, false, null, null, false, null, null, null, null, false, false, null, null, null, false, null, false, null, null, null, null, null, null, -3145729, 31);
            case 10:
                FareDetailsViewState it4 = (FareDetailsViewState) obj;
                Intrinsics.i(it4, "it");
                return FareDetailsViewState.a(it4, null, null, null, false, true, false, null, null, null, false, false, null, false, null, null, false, null, null, null, null, false, false, null, null, null, false, null, false, null, null, null, null, null, null, -262161, 31);
            case 11:
                FareDetailsViewState it5 = (FareDetailsViewState) obj;
                Intrinsics.i(it5, "it");
                return FareDetailsViewState.a(it5, null, null, null, false, true, true, null, null, null, false, false, null, false, null, null, false, null, null, null, null, false, false, null, null, null, false, null, false, null, null, null, null, null, null, -49, 31);
            case 12:
                FareDetailsViewState it6 = (FareDetailsViewState) obj;
                Intrinsics.i(it6, "it");
                return FareDetailsViewState.a(it6, null, null, null, false, false, false, null, null, null, false, false, null, false, null, null, false, null, null, null, null, false, false, null, null, null, false, null, false, null, null, null, null, null, null, -262145, 31);
            case 13:
                FareDetailsViewState it7 = (FareDetailsViewState) obj;
                Intrinsics.i(it7, "it");
                return FareDetailsViewState.a(it7, null, null, null, false, true, false, null, null, null, false, false, null, false, null, null, false, null, null, null, null, false, false, null, null, null, false, null, false, null, null, null, null, null, null, -17, 31);
            case 14:
                FareDetailsViewState it8 = (FareDetailsViewState) obj;
                Intrinsics.i(it8, "it");
                return FareDetailsViewState.a(it8, null, null, null, false, false, false, null, null, null, false, true, null, false, null, null, false, null, null, null, null, false, false, null, null, null, false, null, false, null, null, null, null, null, null, -1025, 31);
            case 15:
                FareDetailsViewState it9 = (FareDetailsViewState) obj;
                Intrinsics.i(it9, "it");
                return FareDetailsViewState.a(it9, null, null, null, false, true, false, null, null, null, false, false, null, false, null, null, false, null, null, null, null, false, false, null, null, null, false, null, false, null, null, null, null, null, null, -17, 31);
            case 16:
                FareDetailsViewState it10 = (FareDetailsViewState) obj;
                Intrinsics.i(it10, "it");
                return FareDetailsViewState.a(it10, null, null, null, false, false, false, null, null, null, false, false, null, false, null, null, false, null, null, null, null, false, false, null, null, null, false, null, false, null, null, null, null, null, null, -16385, 31);
            case 17:
                FareDetailsViewState it11 = (FareDetailsViewState) obj;
                Intrinsics.i(it11, "it");
                return FareDetailsViewState.a(it11, null, null, null, true, false, false, null, null, null, false, false, null, false, null, null, false, null, null, null, null, false, false, null, null, null, false, null, false, null, null, null, null, null, null, -41, 31);
            case 18:
                FareDetailsViewState it12 = (FareDetailsViewState) obj;
                Intrinsics.i(it12, "it");
                return FareDetailsViewState.a(it12, null, null, null, false, false, false, null, null, null, false, false, null, false, null, null, false, null, null, null, null, false, false, null, null, null, false, null, false, null, null, null, null, null, null, -17, 31);
            case 19:
                FareDetailsViewState it13 = (FareDetailsViewState) obj;
                Intrinsics.i(it13, "it");
                return FareDetailsViewState.a(it13, null, null, null, false, false, false, null, null, null, false, false, null, false, null, null, false, null, null, null, null, false, false, null, null, null, false, null, false, null, null, null, null, null, null, -17, 31);
            case 20:
                FareDetailsViewState it14 = (FareDetailsViewState) obj;
                Intrinsics.i(it14, "it");
                return FareDetailsViewState.a(it14, null, null, null, false, false, false, null, null, null, false, false, null, false, null, null, false, null, null, null, null, false, false, null, null, null, true, null, false, null, null, null, null, null, null, -268435457, 31);
            case 21:
                FareDetailsViewState it15 = (FareDetailsViewState) obj;
                Intrinsics.i(it15, "it");
                return FareDetailsViewState.a(it15, null, null, null, false, false, false, null, null, null, false, false, null, false, null, null, false, null, null, null, null, false, false, null, null, null, false, null, false, null, null, null, null, null, null, -268435457, 31);
            case 22:
                FareDetailsViewState it16 = (FareDetailsViewState) obj;
                Intrinsics.i(it16, "it");
                return FareDetailsViewState.a(it16, null, null, null, false, false, true, null, null, null, false, false, null, false, null, null, false, null, null, null, null, false, false, null, null, null, false, null, false, null, null, null, null, null, null, -33, 31);
            case 23:
                return FareDetailsViewState.a((FareDetailsViewState) obj, null, null, null, false, false, false, null, null, null, false, false, null, false, null, null, false, null, null, null, null, false, false, null, null, null, false, null, false, null, null, null, null, null, null, -17, 31);
            case 24:
                return FareDetailsViewState.a((FareDetailsViewState) obj, null, null, null, false, false, true, null, null, null, false, false, null, false, null, null, false, null, null, null, null, false, false, null, null, null, false, null, false, null, null, null, null, null, null, -41, 31);
            case 25:
                return FareDetailsViewState.a((FareDetailsViewState) obj, null, null, null, false, false, true, null, null, null, false, false, null, false, null, null, false, null, null, null, null, false, false, null, null, null, false, null, false, null, null, null, null, null, null, -41, 31);
            case 26:
                return FareDetailsViewState.a((FareDetailsViewState) obj, null, null, null, false, true, false, null, null, null, false, false, null, false, null, null, false, null, null, null, null, false, false, null, null, null, false, null, false, null, null, null, null, null, null, -17, 31);
            case 27:
                return FareDetailsViewState.a((FareDetailsViewState) obj, null, null, null, false, false, false, null, null, null, false, false, null, false, null, null, false, null, null, null, null, false, false, null, null, null, false, null, false, null, null, null, null, null, null, -17, 31);
            case 28:
                return FareDetailsViewState.a((FareDetailsViewState) obj, null, null, null, false, false, false, null, null, null, false, false, null, false, null, null, false, null, null, null, null, false, false, null, null, null, false, null, false, null, null, null, null, null, null, -17, 31);
            default:
                return FareDetailsViewState.a((FareDetailsViewState) obj, null, null, null, false, false, false, null, null, null, false, false, null, false, null, null, false, null, null, null, null, false, false, null, null, null, false, null, false, null, null, null, null, null, null, -1025, 31);
        }
    }
}
