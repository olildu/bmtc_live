package app.chalo.homescreen.data.model.app;

import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializationStrategy;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.PluginHelperInterfacesKt;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"app/chalo/homescreen/data/model/app/HomePageSectionWidgetAppModel.AdsterUnifiedAdSection.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lapp/chalo/homescreen/data/model/app/HomePageSectionWidgetAppModel$AdsterUnifiedAdSection;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Deprecated
public final /* synthetic */ class HomePageSectionWidgetAppModel$AdsterUnifiedAdSection$$serializer implements GeneratedSerializer<HomePageSectionWidgetAppModel.AdsterUnifiedAdSection> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final HomePageSectionWidgetAppModel$AdsterUnifiedAdSection$$serializer f3740a;
    private static final SerialDescriptor descriptor;

    static {
        HomePageSectionWidgetAppModel$AdsterUnifiedAdSection$$serializer homePageSectionWidgetAppModel$AdsterUnifiedAdSection$$serializer = new HomePageSectionWidgetAppModel$AdsterUnifiedAdSection$$serializer();
        f3740a = homePageSectionWidgetAppModel$AdsterUnifiedAdSection$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("app.chalo.homescreen.data.model.app.HomePageSectionWidgetAppModel.AdsterUnifiedAdSection", homePageSectionWidgetAppModel$AdsterUnifiedAdSection$$serializer, 8);
        pluginGeneratedSerialDescriptor.j("sectionId", false);
        pluginGeneratedSerialDescriptor.j("sectionPriority", false);
        pluginGeneratedSerialDescriptor.j("sectionType", false);
        pluginGeneratedSerialDescriptor.j("shouldHighlight", false);
        pluginGeneratedSerialDescriptor.j("widgetSectionId", false);
        pluginGeneratedSerialDescriptor.j("widgetSectionPriority", false);
        pluginGeneratedSerialDescriptor.j("widgetSectionType", false);
        pluginGeneratedSerialDescriptor.j("sectionShouldHighlight", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] childSerializers() {
        Lazy[] lazyArr = HomePageSectionWidgetAppModel.AdsterUnifiedAdSection.k;
        StringSerializer stringSerializer = StringSerializer.f18170a;
        IntSerializer intSerializer = IntSerializer.f18146a;
        BooleanSerializer booleanSerializer = BooleanSerializer.f18123a;
        return new KSerializer[]{stringSerializer, intSerializer, lazyArr[2].getValue(), booleanSerializer, stringSerializer, intSerializer, lazyArr[6].getValue(), booleanSerializer};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        boolean zDecodeBooleanElement;
        HomePageSectionType homePageSectionType;
        HomePageSectionType homePageSectionType2;
        int i;
        boolean z;
        int i2;
        int i3;
        String str;
        String str2;
        int i4;
        Intrinsics.i(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = HomePageSectionWidgetAppModel.AdsterUnifiedAdSection.k;
        int i5 = 7;
        int i6 = 2;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            String strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
            int iDecodeIntElement = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 1);
            HomePageSectionType homePageSectionType3 = (HomePageSectionType) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 2, (DeserializationStrategy) lazyArr[2].getValue(), null);
            boolean zDecodeBooleanElement2 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 3);
            String strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
            int iDecodeIntElement2 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 5);
            homePageSectionType = (HomePageSectionType) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 6, (DeserializationStrategy) lazyArr[6].getValue(), null);
            str = strDecodeStringElement;
            zDecodeBooleanElement = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 7);
            i = iDecodeIntElement2;
            z = zDecodeBooleanElement2;
            str2 = strDecodeStringElement2;
            i2 = 255;
            homePageSectionType2 = homePageSectionType3;
            i3 = iDecodeIntElement;
        } else {
            boolean z2 = true;
            boolean zDecodeBooleanElement3 = false;
            boolean zDecodeBooleanElement4 = false;
            int i7 = 0;
            int iDecodeIntElement3 = 0;
            HomePageSectionType homePageSectionType4 = null;
            String strDecodeStringElement3 = null;
            String strDecodeStringElement4 = null;
            int iDecodeIntElement4 = 0;
            HomePageSectionType homePageSectionType5 = null;
            while (z2) {
                int i8 = i6;
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z2 = false;
                        i5 = 7;
                        i6 = 2;
                        break;
                    case 0:
                        strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
                        i7 |= 1;
                        i5 = 7;
                        i6 = 2;
                        break;
                    case 1:
                        i4 = i8;
                        iDecodeIntElement3 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 1);
                        i7 |= 2;
                        i6 = i4;
                        i5 = 7;
                        break;
                    case 2:
                        i4 = i8;
                        homePageSectionType5 = (HomePageSectionType) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, i4, (DeserializationStrategy) lazyArr[i8].getValue(), homePageSectionType5);
                        i7 |= 4;
                        i6 = i4;
                        i5 = 7;
                        break;
                    case 3:
                        zDecodeBooleanElement4 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 3);
                        i7 |= 8;
                        i6 = i8;
                        break;
                    case 4:
                        strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
                        i7 |= 16;
                        i6 = i8;
                        break;
                    case 5:
                        iDecodeIntElement4 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 5);
                        i7 |= 32;
                        i6 = i8;
                        break;
                    case 6:
                        homePageSectionType4 = (HomePageSectionType) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 6, (DeserializationStrategy) lazyArr[6].getValue(), homePageSectionType4);
                        i7 |= 64;
                        i6 = i8;
                        break;
                    case 7:
                        zDecodeBooleanElement3 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, i5);
                        i7 |= 128;
                        i6 = i8;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            zDecodeBooleanElement = zDecodeBooleanElement3;
            homePageSectionType = homePageSectionType4;
            homePageSectionType2 = homePageSectionType5;
            i = iDecodeIntElement4;
            z = zDecodeBooleanElement4;
            i2 = i7;
            i3 = iDecodeIntElement3;
            str = strDecodeStringElement3;
            str2 = strDecodeStringElement4;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new HomePageSectionWidgetAppModel.AdsterUnifiedAdSection(i2, str, i3, homePageSectionType2, z, str2, i, homePageSectionType, zDecodeBooleanElement);
    }

    @Override // kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object obj) {
        HomePageSectionWidgetAppModel.AdsterUnifiedAdSection value = (HomePageSectionWidgetAppModel.AdsterUnifiedAdSection) obj;
        Intrinsics.i(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        HomePageSectionWidgetAppModel.AdsterUnifiedAdSection.Companion companion = HomePageSectionWidgetAppModel.AdsterUnifiedAdSection.INSTANCE;
        HomePageSectionWidgetAppModel.a(value, compositeEncoderBeginStructure, serialDescriptor);
        Lazy[] lazyArr = HomePageSectionWidgetAppModel.AdsterUnifiedAdSection.k;
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 4, value.g);
        compositeEncoderBeginStructure.encodeIntElement(serialDescriptor, 5, value.h);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 6, (SerializationStrategy) lazyArr[6].getValue(), value.i);
        compositeEncoderBeginStructure.encodeBooleanElement(serialDescriptor, 7, value.j);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final /* bridge */ KSerializer[] typeParametersSerializers() {
        return PluginHelperInterfacesKt.f18164a;
    }
}
