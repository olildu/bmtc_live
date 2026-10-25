package defpackage;

import androidx.compose.foundation.gestures.DragGestureDetectorKt;
import androidx.compose.material3.DatePickerKt;
import androidx.compose.material3.DefaultSingleRowTopAppBarOverride;
import app.chalo.HomeDestinationTabType.DestinationTabType;
import app.chalo.login.data.models.response.DpdpaConsentInfoResponseApiModel$$serializer;
import app.chalo.login.data.models.response.DpdpaUserConsentsInfoResponseApiModel;
import app.chalo.providers.cityprovider.CityProvider;
import app.chalo.providers.cityprovider.impl.data.models.app.CityAppModel;
import app.chalo.superpass.data.models.DigitalTripReceiptRemoteApiRequestModel;
import app.chalo.superpass.data.models.PassActivationsApiRequestModel$$serializer;
import app.chalo.superpass.data.models.TicketActivationsApiRequestModel$$serializer;
import app.chalo.uistate.dialog.DatePickerUIStateFactory;
import app.chalo.uistate.dialog.DatePickerUIStateFactory$defaultSelectableDates$2$1;
import app.chalo.universalsearch.data.DestinationAfterUniversalSearch;
import app.chalo.usecase.DebugAnalyticsEventsRemoteConfigModel;
import app.chalo.usecase.DebugAnalyticsEventsValidUserConfig$$serializer;
import chalo_app_kmm.shared.chalo_base.generated.resources.Drawable0_commonMainKt;
import io.github.alexzhirkevich.compottie.DotLottieAnimation$$serializer;
import io.github.alexzhirkevich.compottie.DotLottieManifest;
import io.ktor.client.plugins.DoubleReceivePluginKt;
import io.ktor.util.AttributeKey;
import io.ktor.util.logging.KtorSimpleLoggerJvmKt;
import kotlin.Lazy;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptySet;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlinx.datetime.DateTimeUnit;
import kotlinx.datetime.LocalDate;
import kotlinx.datetime.LocalDateTime;
import kotlinx.datetime.TimeZone;
import kotlinx.datetime.format.DateTimeComponents;
import kotlinx.datetime.format.DateTimeFormat;
import kotlinx.datetime.format.DateTimeFormatKt;
import kotlinx.datetime.format.LocalDateFormatKt;
import kotlinx.datetime.format.LocalTimeFormatKt;
import kotlinx.datetime.format.UtcOffsetFormat;
import kotlinx.datetime.format.UtcOffsetFormatKt;
import kotlinx.datetime.format.YearMonthFormatKt;
import kotlinx.datetime.serializers.DateTimeUnitSerializer;
import kotlinx.datetime.serializers.DayBasedDateTimeUnitSerializer;
import kotlinx.datetime.serializers.MonthBasedDateTimeUnitSerializer;
import kotlinx.datetime.serializers.TimeBasedDateTimeUnitSerializer;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SealedClassSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptorsKt;
import kotlinx.serialization.internal.ArrayListSerializer;
import org.jetbrains.compose.resources.DensityQualifier;
import org.jetbrains.compose.resources.DrawableResource;
import org.jetbrains.compose.resources.ResourceItem;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class yv implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20145a;

    public /* synthetic */ yv(int i) {
        this.f20145a = i;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        String str;
        switch (this.f20145a) {
            case 0:
                return DatePickerKt.DatePickerContent$lambda$25$lambda$24();
            case 1:
                DatePickerUIStateFactory datePickerUIStateFactory = DatePickerUIStateFactory.f9980a;
                return new DatePickerUIStateFactory$defaultSelectableDates$2$1();
            case 2:
                TimeZone.Companion companion = TimeZone.INSTANCE;
                CityAppModel cityAppModel = (CityAppModel) ((CityProvider) DatePickerUIStateFactory.b.getValue()).getE().getValue();
                if (cityAppModel == null || (str = cityAppModel.l) == null) {
                    str = "Asia/Kolkata";
                }
                companion.getClass();
                return TimeZone.Companion.a(str);
            case 3:
                Lazy lazy = DateTimeFormatKt.f17954a;
                Pair pair = new Pair("dateTimeComponents(DateTimeComponents.Formats.RFC_1123)", DateTimeFormatKt.a(DateTimeComponents.Formats.b));
                Pair pair2 = new Pair("dateTimeComponents(DateTimeComponents.Formats.ISO_DATE_TIME_OFFSET)", DateTimeFormatKt.a(DateTimeComponents.Formats.f17948a));
                Pair pair3 = new Pair("date(LocalDateTime.Formats.ISO)", DateTimeFormatKt.a(LocalDateTime.Formats.f17936a));
                DateTimeFormat dateTimeFormat = LocalDate.Formats.f17932a;
                return CollectionsKt.S(pair, pair2, pair3, new Pair("date(LocalDate.Formats.ISO)", DateTimeFormatKt.a(LocalDateFormatKt.a())), new Pair("date(LocalDate.Formats.ISO_BASIC)", DateTimeFormatKt.a(LocalDate.Formats.f17932a)), new Pair("time(LocalTime.Formats.ISO)", DateTimeFormatKt.a(LocalTimeFormatKt.a())), new Pair("offset(UtcOffset.Formats.ISO)", DateTimeFormatKt.a((UtcOffsetFormat) UtcOffsetFormatKt.f17988a.getValue())), new Pair("offset(UtcOffset.Formats.ISO_BASIC)", DateTimeFormatKt.a((UtcOffsetFormat) UtcOffsetFormatKt.b.getValue())), new Pair("offset(UtcOffset.Formats.FOUR_DIGITS)", DateTimeFormatKt.a((UtcOffsetFormat) UtcOffsetFormatKt.c.getValue())), new Pair("yearMonth(YearMonth.Formats.ISO)", DateTimeFormatKt.a((DateTimeFormat) YearMonthFormatKt.b.getValue())));
            case 4:
                DateTimeUnitSerializer dateTimeUnitSerializer = DateTimeUnitSerializer.f18055a;
                return new SealedClassSerializer("kotlinx.datetime.DateTimeUnit", Reflection.a(DateTimeUnit.class), new KClass[]{Reflection.a(DateTimeUnit.DayBased.class), Reflection.a(DateTimeUnit.MonthBased.class), Reflection.a(DateTimeUnit.TimeBased.class)}, new KSerializer[]{DayBasedDateTimeUnitSerializer.f18056a, MonthBasedDateTimeUnitSerializer.f18072a, TimeBasedDateTimeUnitSerializer.f18074a});
            case 5:
                DayBasedDateTimeUnitSerializer dayBasedDateTimeUnitSerializer = DayBasedDateTimeUnitSerializer.f18056a;
                return SerialDescriptorsKt.c("kotlinx.datetime.DayBased", new SerialDescriptor[0], new nw(11));
            case 6:
                DebugAnalyticsEventsRemoteConfigModel.Companion companion2 = DebugAnalyticsEventsRemoteConfigModel.INSTANCE;
                return new ArrayListSerializer(DebugAnalyticsEventsValidUserConfig$$serializer.f10164a);
            case 7:
                return "marker";
            case 8:
                return Float.valueOf(DefaultSingleRowTopAppBarOverride.SingleRowTopAppBar$lambda$15$lambda$14$lambda$13());
            case 9:
                return DestinationAfterUniversalSearch._init_$_anonymous_();
            case 10:
                return DestinationTabType._init_$_anonymous_();
            case 11:
                DigitalTripReceiptRemoteApiRequestModel.Companion companion3 = DigitalTripReceiptRemoteApiRequestModel.INSTANCE;
                return new ArrayListSerializer(PassActivationsApiRequestModel$$serializer.f9528a);
            case 12:
                DigitalTripReceiptRemoteApiRequestModel.Companion companion4 = DigitalTripReceiptRemoteApiRequestModel.INSTANCE;
                return new ArrayListSerializer(TicketActivationsApiRequestModel$$serializer.f9538a);
            case 13:
                DotLottieManifest.Companion companion5 = DotLottieManifest.INSTANCE;
                return new ArrayListSerializer(DotLottieAnimation$$serializer.f16084a);
            case 14:
                AttributeKey attributeKey = DoubleReceivePluginKt.f16649a;
                return KtorSimpleLoggerJvmKt.a("io.ktor.client.plugins.SaveBody");
            case 15:
                DpdpaUserConsentsInfoResponseApiModel.Companion companion6 = DpdpaUserConsentsInfoResponseApiModel.INSTANCE;
                return new ArrayListSerializer(DpdpaConsentInfoResponseApiModel$$serializer.f5212a);
            case 16:
                return Unit.f17538a;
            case 17:
                return Unit.f17538a;
            case 18:
                return Unit.f17538a;
            case 19:
                return Unit.f17538a;
            case 20:
                return Unit.f17538a;
            case 21:
                return Unit.f17538a;
            case 22:
                return Unit.f17538a;
            case 23:
                return Unit.f17538a;
            case 24:
                return Boolean.valueOf(DragGestureDetectorKt.detectDragGestures$lambda$5());
            case 25:
                return Unit.f17538a;
            case 26:
                return Boolean.valueOf(DragGestureDetectorKt.detectDragGestures$lambda$9());
            case 27:
                Lazy lazy2 = Drawable0_commonMainKt.f11289a;
                return new DrawableResource("drawable:ac_bg", SetsKt.g(new ResourceItem(SetsKt.g(DensityQualifier.XXHDPI), "composeResources/chalo_app_kmm.shared.chalo_base.generated.resources/drawable-xxhdpi/ac_bg.png", -1L, -1L)));
            case 28:
                Lazy lazy3 = Drawable0_commonMainKt.f11289a;
                return new DrawableResource("drawable:bleValidationGif", SetsKt.g(new ResourceItem(EmptySet.f17559a, "composeResources/chalo_app_kmm.shared.chalo_base.generated.resources/drawable/bleValidationGif.gif", -1L, -1L)));
            default:
                Lazy lazy4 = Drawable0_commonMainKt.f11289a;
                return new DrawableResource("drawable:acknowledgement_pass_ticket", SetsKt.g(new ResourceItem(EmptySet.f17559a, "composeResources/chalo_app_kmm.shared.chalo_base.generated.resources/drawable/acknowledgement_pass_ticket.png", -1L, -1L)));
        }
    }
}
