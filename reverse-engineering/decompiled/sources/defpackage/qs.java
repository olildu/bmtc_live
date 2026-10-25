package defpackage;

import androidx.compose.foundation.text.CoreTextFieldKt;
import androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$8$1$1$2;
import androidx.compose.material3.DatePickerKt;
import androidx.compose.material3.DateRangePickerKt;
import androidx.compose.runtime.ComposerImplKt;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.TextLayoutResult;
import app.chalo.checkout.ui.screen.checkout.customurl.CustomUrlCheckoutDataState;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.providers.iconassetprovider.IconType;
import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.base.UiEventHandler;
import app.chalo.uistate.image.ImageUISize;
import app.chalo.uistate.image.ImageUIState;
import app.chalo.uistate.image.UIContentScale;
import io.ktor.client.plugins.contentnegotiation.ContentNegotiationConfig;
import io.ktor.client.plugins.contentnegotiation.ContentNegotiationKt;
import io.ktor.http.CookieKt;
import io.ktor.http.CookieUtilsKt;
import io.ktor.http.cio.ConnectionOptions;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.EmptyList;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.MatchGroup;
import kotlin.text.MatchResult;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.datetime.format.DateTimeComponents;
import kotlinx.datetime.format.DateTimeComponentsFormat;
import kotlinx.datetime.format.DateTimeFormatBuilder;
import kotlinx.datetime.format.DateTimeFormatBuilderKt;
import kotlinx.datetime.format.LocalDateFormatKt;
import kotlinx.datetime.format.Padding;
import kotlinx.datetime.serializers.DatePeriodComponentSerializer;
import kotlinx.serialization.descriptors.ClassSerialDescriptorBuilder;
import kotlinx.serialization.descriptors.SerialDescriptorImpl;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PrimitiveSerialDescriptor;
import org.slf4j.Logger;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class qs implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19150a;

    public /* synthetic */ qs(int i) {
        this.f19150a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.f19150a;
        int i2 = 4;
        int i3 = 2;
        int i4 = 0;
        Unit unit = Unit.f17538a;
        switch (i) {
            case 0:
                return new ImageUIState(IconType.IC_EXPAND_ARROW, (String) null, (ChaloColorToken) null, new ImageUISize(ChaloThemeHelper.a().h), (UIContentScale) null, ((Float) obj).floatValue(), (UiEventHandler) null, 182);
            case 1:
                Pair it = (Pair) obj;
                int i5 = ConnectionOptions.e;
                Intrinsics.i(it, "it");
                return Integer.valueOf(((String) it.d()).length());
            case 2:
                ContentNegotiationConfig.ConverterRegistration it2 = (ContentNegotiationConfig.ConverterRegistration) obj;
                Logger logger = ContentNegotiationKt.f16704a;
                Intrinsics.i(it2, "it");
                return it2.f16702a.toString();
            case 3:
                return Boolean.valueOf(CookieUtilsKt.a(((Character) obj).charValue()));
            case 4:
                return Boolean.valueOf(CookieUtilsKt.c(((Character) obj).charValue()));
            case 5:
                return Boolean.valueOf(CookieUtilsKt.c(((Character) obj).charValue()));
            case 6:
                return Boolean.valueOf(CookieUtilsKt.a(((Character) obj).charValue()));
            case 7:
                MatchResult it3 = (MatchResult) obj;
                Set set = CookieKt.f16771a;
                Intrinsics.i(it3, "it");
                MatchGroup matchGroupA = it3.getC().a(2);
                String str = matchGroupA != null ? matchGroupA.f17680a : "";
                MatchGroup matchGroupA2 = it3.getC().a(4);
                return new Pair(str, matchGroupA2 != null ? matchGroupA2.f17680a : "");
            case 8:
                Pair cookie = (Pair) obj;
                Set set2 = CookieKt.f16771a;
                Intrinsics.i(cookie, "cookie");
                return (StringsKt.a0((String) cookie.e(), "\"", false) && StringsKt.u((String) cookie.e(), "\"", false)) ? Pair.c(cookie, null, StringsKt.O((String) cookie.e()), 1) : cookie;
            case 9:
                return CoreTextFieldKt.CoreTextField$lambda$0$0((TextLayoutResult) obj);
            case 10:
                return CoreTextFieldKt$CoreTextField$8$1$1$2.measure_3p2s80s$lambda$2((Placeable.PlacementScope) obj);
            case 11:
                CoroutineContext.Element element = (CoroutineContext.Element) obj;
                if (element instanceof CoroutineDispatcher) {
                    return (CoroutineDispatcher) element;
                }
                return null;
            case 12:
                CustomUrlCheckoutDataState it4 = (CustomUrlCheckoutDataState) obj;
                Intrinsics.i(it4, "it");
                return CustomUrlCheckoutDataState.a(it4, false, null, 0, false, 63);
            case 13:
                CustomUrlCheckoutDataState it5 = (CustomUrlCheckoutDataState) obj;
                Intrinsics.i(it5, "it");
                return CustomUrlCheckoutDataState.a(it5, false, null, 0, false, ComposerImplKt.nodeKey);
            case 14:
                CustomUrlCheckoutDataState it6 = (CustomUrlCheckoutDataState) obj;
                Intrinsics.i(it6, "it");
                return CustomUrlCheckoutDataState.a(it6, false, null, 0, false, 95);
            case 15:
                CustomUrlCheckoutDataState it7 = (CustomUrlCheckoutDataState) obj;
                Intrinsics.i(it7, "it");
                return CustomUrlCheckoutDataState.a(it7, false, null, 0, true, 63);
            case 16:
                CustomUrlCheckoutDataState it8 = (CustomUrlCheckoutDataState) obj;
                Intrinsics.i(it8, "it");
                return CustomUrlCheckoutDataState.a(it8, false, null, 0, false, 63);
            case 17:
                CustomUrlCheckoutDataState it9 = (CustomUrlCheckoutDataState) obj;
                Intrinsics.i(it9, "it");
                return CustomUrlCheckoutDataState.a(it9, false, null, 0, false, 63);
            case 18:
                CustomUrlCheckoutDataState it10 = (CustomUrlCheckoutDataState) obj;
                Intrinsics.i(it10, "it");
                return CustomUrlCheckoutDataState.a(it10, false, null, 0, false, ComposerImplKt.nodeKey);
            case 19:
                return unit;
            case 20:
                ClassSerialDescriptorBuilder buildClassSerialDescriptor = (ClassSerialDescriptorBuilder) obj;
                SerialDescriptorImpl serialDescriptorImpl = DatePeriodComponentSerializer.f18049a;
                Intrinsics.i(buildClassSerialDescriptor, "$this$buildClassSerialDescriptor");
                EmptyList emptyList = EmptyList.f17557a;
                IntSerializer intSerializer = IntSerializer.f18146a;
                PrimitiveSerialDescriptor primitiveSerialDescriptor = IntSerializer.b;
                buildClassSerialDescriptor.a("years", primitiveSerialDescriptor, emptyList, true);
                buildClassSerialDescriptor.a("months", primitiveSerialDescriptor, emptyList, true);
                buildClassSerialDescriptor.a("days", primitiveSerialDescriptor, emptyList, true);
                buildClassSerialDescriptor.a("hours", primitiveSerialDescriptor, emptyList, true);
                buildClassSerialDescriptor.a("minutes", primitiveSerialDescriptor, emptyList, true);
                buildClassSerialDescriptor.a("seconds", primitiveSerialDescriptor, emptyList, true);
                LongSerializer longSerializer = LongSerializer.f18151a;
                buildClassSerialDescriptor.a("nanoseconds", LongSerializer.b, emptyList, true);
                return unit;
            case 21:
                return Integer.valueOf(DatePickerKt.SwitchableDateEntryContent_KaiTk9E$lambda$21$lambda$20$lambda$15(((Integer) obj).intValue()));
            case 22:
                return Integer.valueOf(DatePickerKt.SwitchableDateEntryContent_KaiTk9E$lambda$21$lambda$20$lambda$18(((Integer) obj).intValue()));
            case 23:
                return DatePickerKt.SwitchableDateEntryContent_KaiTk9E$lambda$14$lambda$13((SemanticsPropertyReceiver) obj);
            case 24:
                return DatePickerKt.DateEntryContainer_au3_HiA$lambda$8$lambda$7((SemanticsPropertyReceiver) obj);
            case 25:
                return DateRangePickerKt.SwitchableDateEntryContent_eVtQiho$lambda$8$lambda$7((SemanticsPropertyReceiver) obj);
            case 26:
                DateTimeFormatBuilder.WithDateTimeComponents Format = (DateTimeFormatBuilder.WithDateTimeComponents) obj;
                DateTimeComponentsFormat dateTimeComponentsFormat = DateTimeComponents.Formats.f17948a;
                Intrinsics.i(Format, "$this$Format");
                Format.n(LocalDateFormatKt.a());
                DateTimeFormatBuilderKt.a(Format, new Function1[]{new nw(i3)}, new nw(3));
                Format.u(Padding.ZERO);
                DateTimeFormatBuilderKt.b(Format, ':');
                Format.r(Padding.ZERO);
                DateTimeFormatBuilderKt.b(Format, ':');
                Format.s(Padding.ZERO);
                DateTimeFormatBuilderKt.c(Format, "", new nw(i2));
                DateTimeFormatBuilderKt.a(Format, new Function1[]{new nw(5)}, new nw(6));
                return unit;
            case 27:
                DateTimeFormatBuilder.WithDateTimeComponents alternativeParsing = (DateTimeFormatBuilder.WithDateTimeComponents) obj;
                DateTimeComponentsFormat dateTimeComponentsFormat2 = DateTimeComponents.Formats.f17948a;
                Intrinsics.i(alternativeParsing, "$this$alternativeParsing");
                alternativeParsing.e("UT");
                return unit;
            case 28:
                DateTimeFormatBuilder.WithDateTimeComponents alternativeParsing2 = (DateTimeFormatBuilder.WithDateTimeComponents) obj;
                DateTimeComponentsFormat dateTimeComponentsFormat3 = DateTimeComponents.Formats.f17948a;
                Intrinsics.i(alternativeParsing2, "$this$alternativeParsing");
                alternativeParsing2.e("Z");
                return unit;
            default:
                DateTimeFormatBuilder.WithDateTimeComponents alternativeParsing3 = (DateTimeFormatBuilder.WithDateTimeComponents) obj;
                DateTimeComponentsFormat dateTimeComponentsFormat4 = DateTimeComponents.Formats.f17948a;
                Intrinsics.i(alternativeParsing3, "$this$alternativeParsing");
                DateTimeFormatBuilderKt.c(alternativeParsing3, "GMT", new nw(i4));
                return unit;
        }
    }
}
