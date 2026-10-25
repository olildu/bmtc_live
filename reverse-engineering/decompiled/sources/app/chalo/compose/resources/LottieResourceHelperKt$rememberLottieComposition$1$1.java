package app.chalo.compose.resources;

import androidx.compose.runtime.ProvidableCompositionLocal;
import app.chalo.providers.lottieassetprovider.ActiveLottieType;
import app.chalo.providers.lottieassetprovider.BrandLottieType;
import app.chalo.providers.lottieassetprovider.CommonLottieType;
import app.chalo.providers.lottieassetprovider.LottieExtensionType;
import app.chalo.providers.lottieassetprovider.LottieType;
import defpackage.vo1;
import io.github.alexzhirkevich.compottie.DotLottieCompositionSpecKt;
import io.github.alexzhirkevich.compottie.LottieCompositionSpec;
import java.io.IOException;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.compose.resources.DefaultAndroidResourceReader;
import org.jetbrains.compose.resources.MissingResourceException;
import org.jetbrains.compose.resources.ResourceReaderKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", "Lio/github/alexzhirkevich/compottie/LottieCompositionSpec;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.compose.resources.LottieResourceHelperKt$rememberLottieComposition$1$1", f = "LottieResourceHelper.kt", l = {24, 30}, m = "invokeSuspend", v = 1)
final class LottieResourceHelperKt$rememberLottieComposition$1$1 extends SuspendLambda implements Function1<Continuation<? super LottieCompositionSpec>, Object> {
    final /* synthetic */ LottieType $lottieType;
    Object L$0;
    int label;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f1908a;

        static {
            int[] iArr = new int[LottieExtensionType.values().length];
            try {
                iArr[LottieExtensionType.DOT_LOTTIE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LottieExtensionType.JSON.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f1908a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LottieResourceHelperKt$rememberLottieComposition$1$1(LottieType lottieType, Continuation continuation) {
        super(1, continuation);
        this.$lottieType = lottieType;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new LottieResourceHelperKt$rememberLottieComposition$1$1(this.$lottieType, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((LottieResourceHelperKt$rememberLottieComposition$1$1) create((Continuation) obj)).invokeSuspend(Unit.f17538a);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0061  */
    /* JADX WARN: Code duplicated, block: B:19:0x006c  */
    /* JADX WARN: Code duplicated, block: B:21:0x0086  */
    /* JADX WARN: Code duplicated, block: B:22:0x0089  */
    /* JADX WARN: Code duplicated, block: B:23:0x008c  */
    /* JADX WARN: Code duplicated, block: B:24:0x008f  */
    /* JADX WARN: Code duplicated, block: B:25:0x0092  */
    /* JADX WARN: Code duplicated, block: B:26:0x0095  */
    /* JADX WARN: Code duplicated, block: B:27:0x0098  */
    /* JADX WARN: Code duplicated, block: B:28:0x009b  */
    /* JADX WARN: Code duplicated, block: B:29:0x009e  */
    /* JADX WARN: Code duplicated, block: B:30:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:31:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:32:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:33:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:34:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:35:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:36:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:37:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:38:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:39:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:40:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:41:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:42:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:43:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:44:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:45:0x00ce  */
    /* JADX WARN: Instruction removed from duplicated block: B:19:0x006c, please report this as an issue */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws MissingResourceException, IOException {
        LottieExtensionType f716a;
        LottieCompositionSpec.Companion companion;
        LottieCompositionSpec.Companion companion2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                companion = (LottieCompositionSpec.Companion) this.L$0;
                ResultKt.b(obj);
                return DotLottieCompositionSpecKt.a(companion, (byte[]) obj);
            }
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            companion2 = (LottieCompositionSpec.Companion) this.L$0;
            ResultKt.b(obj);
            String strP = StringsKt.p((byte[]) obj);
            companion2.getClass();
            return LottieCompositionSpec.Companion.a(strP);
        }
        ResultKt.b(obj);
        LottieType lottieType = this.$lottieType;
        Intrinsics.i(lottieType, "lottieType");
        String lowerCase = lottieType.name().toLowerCase(Locale.ROOT);
        Intrinsics.h(lowerCase, "toLowerCase(...)");
        String strConcat = "files/raw/".concat(lowerCase);
        LottieType lottieType2 = this.$lottieType;
        Intrinsics.i(lottieType2, "lottieType");
        BrandLottieType brandLottieType = ActiveLottieType.f8861a;
        if (brandLottieType == null) {
            switch (CommonLottieType.WhenMappings.f8864a[lottieType2.ordinal()]) {
                case 1:
                    f716a = LottieExtensionType.DOT_LOTTIE;
                    break;
                case 2:
                    f716a = LottieExtensionType.DOT_LOTTIE;
                    break;
                case 3:
                    f716a = LottieExtensionType.JSON;
                    break;
                case 4:
                    f716a = LottieExtensionType.DOT_LOTTIE;
                    break;
                case 5:
                    f716a = LottieExtensionType.DOT_LOTTIE;
                    break;
                case 6:
                    f716a = LottieExtensionType.DOT_LOTTIE;
                    break;
                case 7:
                    f716a = LottieExtensionType.DOT_LOTTIE;
                    break;
                case 8:
                    f716a = LottieExtensionType.DOT_LOTTIE;
                    break;
                case 9:
                    f716a = LottieExtensionType.DOT_LOTTIE;
                    break;
                case 10:
                    f716a = LottieExtensionType.JSON;
                    break;
                case 11:
                    f716a = LottieExtensionType.DOT_LOTTIE;
                    break;
                case 12:
                    f716a = LottieExtensionType.DOT_LOTTIE;
                    break;
                case 13:
                    f716a = LottieExtensionType.DOT_LOTTIE;
                    break;
                case 14:
                    f716a = LottieExtensionType.DOT_LOTTIE;
                    break;
                case 15:
                    f716a = LottieExtensionType.DOT_LOTTIE;
                    break;
                case 16:
                    f716a = LottieExtensionType.DOT_LOTTIE;
                    break;
                case 17:
                    f716a = LottieExtensionType.DOT_LOTTIE;
                    break;
                case 18:
                    f716a = LottieExtensionType.JSON;
                    break;
                case 19:
                    f716a = LottieExtensionType.JSON;
                    break;
                case 20:
                    f716a = LottieExtensionType.JSON;
                    break;
                case 21:
                    f716a = LottieExtensionType.JSON;
                    break;
                case 22:
                    f716a = LottieExtensionType.JSON;
                    break;
                case 23:
                    f716a = LottieExtensionType.JSON;
                    break;
                case 24:
                    f716a = LottieExtensionType.JSON;
                    break;
                case 25:
                    f716a = LottieExtensionType.JSON;
                    break;
                default:
                    throw new IllegalStateException(("Brand lottie extension missing for " + CommonLottieType.f8863a).toString());
            }
        } else {
            f716a = BrandLottieType.WhenMappings.f8862a[lottieType2.ordinal()] == 1 ? brandLottieType.getF716a() : null;
            if (f716a == null) {
                switch (CommonLottieType.WhenMappings.f8864a[lottieType2.ordinal()]) {
                    case 1:
                        f716a = LottieExtensionType.DOT_LOTTIE;
                        break;
                    case 2:
                        f716a = LottieExtensionType.DOT_LOTTIE;
                        break;
                    case 3:
                        f716a = LottieExtensionType.JSON;
                        break;
                    case 4:
                        f716a = LottieExtensionType.DOT_LOTTIE;
                        break;
                    case 5:
                        f716a = LottieExtensionType.DOT_LOTTIE;
                        break;
                    case 6:
                        f716a = LottieExtensionType.DOT_LOTTIE;
                        break;
                    case 7:
                        f716a = LottieExtensionType.DOT_LOTTIE;
                        break;
                    case 8:
                        f716a = LottieExtensionType.DOT_LOTTIE;
                        break;
                    case 9:
                        f716a = LottieExtensionType.DOT_LOTTIE;
                        break;
                    case 10:
                        f716a = LottieExtensionType.JSON;
                        break;
                    case 11:
                        f716a = LottieExtensionType.DOT_LOTTIE;
                        break;
                    case 12:
                        f716a = LottieExtensionType.DOT_LOTTIE;
                        break;
                    case 13:
                        f716a = LottieExtensionType.DOT_LOTTIE;
                        break;
                    case 14:
                        f716a = LottieExtensionType.DOT_LOTTIE;
                        break;
                    case 15:
                        f716a = LottieExtensionType.DOT_LOTTIE;
                        break;
                    case 16:
                        f716a = LottieExtensionType.DOT_LOTTIE;
                        break;
                    case 17:
                        f716a = LottieExtensionType.DOT_LOTTIE;
                        break;
                    case 18:
                        f716a = LottieExtensionType.JSON;
                        break;
                    case 19:
                        f716a = LottieExtensionType.JSON;
                        break;
                    case 20:
                        f716a = LottieExtensionType.JSON;
                        break;
                    case 21:
                        f716a = LottieExtensionType.JSON;
                        break;
                    case 22:
                        f716a = LottieExtensionType.JSON;
                        break;
                    case 23:
                        f716a = LottieExtensionType.JSON;
                        break;
                    case 24:
                        f716a = LottieExtensionType.JSON;
                        break;
                    case 25:
                        f716a = LottieExtensionType.JSON;
                        break;
                    default:
                        throw new IllegalStateException(("Brand lottie extension missing for " + CommonLottieType.f8863a).toString());
                }
            }
        }
        int i2 = WhenMappings.f1908a[f716a.ordinal()];
        DefaultAndroidResourceReader defaultAndroidResourceReader = DefaultAndroidResourceReader.f18773a;
        LottieCompositionSpec.Companion companion3 = LottieCompositionSpec.Companion.f16107a;
        if (i2 == 1) {
            String strA = vo1.A(strConcat, ".lottie");
            this.L$0 = companion3;
            this.label = 1;
            String strM = vo1.m("composeResources/chalo_app_kmm.shared.chalo_base.generated.resources/", strA);
            ProvidableCompositionLocal providableCompositionLocal = ResourceReaderKt.f18785a;
            obj = defaultAndroidResourceReader.b(strM);
            if (obj != coroutineSingletons) {
                companion = companion3;
                return DotLottieCompositionSpecKt.a(companion, (byte[]) obj);
            }
        } else {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            String strA2 = vo1.A(strConcat, ".json");
            this.L$0 = companion3;
            this.label = 2;
            String strM2 = vo1.m("composeResources/chalo_app_kmm.shared.chalo_base.generated.resources/", strA2);
            ProvidableCompositionLocal providableCompositionLocal2 = ResourceReaderKt.f18785a;
            obj = defaultAndroidResourceReader.b(strM2);
            if (obj != coroutineSingletons) {
                companion2 = companion3;
                String strP2 = StringsKt.p((byte[]) obj);
                companion2.getClass();
                return LottieCompositionSpec.Companion.a(strP2);
            }
        }
        return coroutineSingletons;
    }
}
