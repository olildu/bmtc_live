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
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"app/chalo/homescreen/data/model/app/RegularBusSectionWidgetAppModel.FAQSection.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lapp/chalo/homescreen/data/model/app/RegularBusSectionWidgetAppModel$FAQSection;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Deprecated
public final /* synthetic */ class RegularBusSectionWidgetAppModel$FAQSection$$serializer implements GeneratedSerializer<RegularBusSectionWidgetAppModel.FAQSection> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final RegularBusSectionWidgetAppModel$FAQSection$$serializer f3799a;
    private static final SerialDescriptor descriptor;

    static {
        RegularBusSectionWidgetAppModel$FAQSection$$serializer regularBusSectionWidgetAppModel$FAQSection$$serializer = new RegularBusSectionWidgetAppModel$FAQSection$$serializer();
        f3799a = regularBusSectionWidgetAppModel$FAQSection$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("app.chalo.homescreen.data.model.app.RegularBusSectionWidgetAppModel.FAQSection", regularBusSectionWidgetAppModel$FAQSection$$serializer, 9);
        pluginGeneratedSerialDescriptor.j("sectionId", false);
        pluginGeneratedSerialDescriptor.j("sectionPriority", false);
        pluginGeneratedSerialDescriptor.j("sectionType", false);
        pluginGeneratedSerialDescriptor.j("shouldHighlight", false);
        pluginGeneratedSerialDescriptor.j("widgetSectionId", false);
        pluginGeneratedSerialDescriptor.j("widgetSectionPriority", false);
        pluginGeneratedSerialDescriptor.j("widgetSectionType", false);
        pluginGeneratedSerialDescriptor.j("faqSectionAppModel", false);
        pluginGeneratedSerialDescriptor.j("sectionShouldHighlight", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] childSerializers() {
        Lazy[] lazyArr = RegularBusSectionWidgetAppModel.FAQSection.l;
        StringSerializer stringSerializer = StringSerializer.f18170a;
        IntSerializer intSerializer = IntSerializer.f18146a;
        BooleanSerializer booleanSerializer = BooleanSerializer.f18123a;
        return new KSerializer[]{stringSerializer, intSerializer, lazyArr[2].getValue(), booleanSerializer, stringSerializer, intSerializer, lazyArr[6].getValue(), FAQSectionAppModel$$serializer.f3734a, booleanSerializer};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        int i;
        FAQSectionAppModel fAQSectionAppModel;
        RegularBusPageSectionType regularBusPageSectionType;
        RegularBusPageSectionType regularBusPageSectionType2;
        boolean z;
        boolean zDecodeBooleanElement;
        int i2;
        int i3;
        String str;
        String str2;
        Intrinsics.i(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = RegularBusSectionWidgetAppModel.FAQSection.l;
        int i4 = 7;
        int i5 = 5;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            String strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
            int iDecodeIntElement = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 1);
            RegularBusPageSectionType regularBusPageSectionType3 = (RegularBusPageSectionType) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 2, (DeserializationStrategy) lazyArr[2].getValue(), null);
            boolean zDecodeBooleanElement2 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 3);
            String strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
            int iDecodeIntElement2 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 5);
            regularBusPageSectionType = (RegularBusPageSectionType) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 6, (DeserializationStrategy) lazyArr[6].getValue(), null);
            str = strDecodeStringElement;
            fAQSectionAppModel = (FAQSectionAppModel) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 7, FAQSectionAppModel$$serializer.f3734a, null);
            i = iDecodeIntElement2;
            z = zDecodeBooleanElement2;
            zDecodeBooleanElement = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 8);
            str2 = strDecodeStringElement2;
            i2 = 511;
            regularBusPageSectionType2 = regularBusPageSectionType3;
            i3 = iDecodeIntElement;
        } else {
            boolean z2 = true;
            int iDecodeIntElement3 = 0;
            boolean zDecodeBooleanElement3 = false;
            int i6 = 0;
            int iDecodeIntElement4 = 0;
            FAQSectionAppModel fAQSectionAppModel2 = null;
            RegularBusPageSectionType regularBusPageSectionType4 = null;
            String strDecodeStringElement3 = null;
            String strDecodeStringElement4 = null;
            boolean zDecodeBooleanElement4 = false;
            RegularBusPageSectionType regularBusPageSectionType5 = null;
            while (z2) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z2 = false;
                        i4 = 7;
                        break;
                    case 0:
                        strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
                        i6 |= 1;
                        i4 = 7;
                        i5 = 5;
                        break;
                    case 1:
                        iDecodeIntElement4 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 1);
                        i6 |= 2;
                        i4 = 7;
                        i5 = 5;
                        break;
                    case 2:
                        regularBusPageSectionType5 = (RegularBusPageSectionType) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 2, (DeserializationStrategy) lazyArr[2].getValue(), regularBusPageSectionType5);
                        i6 |= 4;
                        i4 = 7;
                        i5 = 5;
                        break;
                    case 3:
                        zDecodeBooleanElement4 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 3);
                        i6 |= 8;
                        break;
                    case 4:
                        strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
                        i6 |= 16;
                        break;
                    case 5:
                        iDecodeIntElement3 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, i5);
                        i6 |= 32;
                        break;
                    case 6:
                        regularBusPageSectionType4 = (RegularBusPageSectionType) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 6, (DeserializationStrategy) lazyArr[6].getValue(), regularBusPageSectionType4);
                        i6 |= 64;
                        break;
                    case 7:
                        fAQSectionAppModel2 = (FAQSectionAppModel) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, i4, FAQSectionAppModel$$serializer.f3734a, fAQSectionAppModel2);
                        i6 |= 128;
                        break;
                    case 8:
                        zDecodeBooleanElement3 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 8);
                        i6 |= 256;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            i = iDecodeIntElement3;
            fAQSectionAppModel = fAQSectionAppModel2;
            regularBusPageSectionType = regularBusPageSectionType4;
            regularBusPageSectionType2 = regularBusPageSectionType5;
            z = zDecodeBooleanElement4;
            zDecodeBooleanElement = zDecodeBooleanElement3;
            i2 = i6;
            i3 = iDecodeIntElement4;
            str = strDecodeStringElement3;
            str2 = strDecodeStringElement4;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new RegularBusSectionWidgetAppModel.FAQSection(i2, str, i3, regularBusPageSectionType2, z, str2, i, regularBusPageSectionType, fAQSectionAppModel, zDecodeBooleanElement);
    }

    @Override // kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object obj) {
        RegularBusSectionWidgetAppModel.FAQSection value = (RegularBusSectionWidgetAppModel.FAQSection) obj;
        Intrinsics.i(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        RegularBusSectionWidgetAppModel.FAQSection.Companion companion = RegularBusSectionWidgetAppModel.FAQSection.INSTANCE;
        RegularBusSectionWidgetAppModel.a(value, compositeEncoderBeginStructure, serialDescriptor);
        Lazy[] lazyArr = RegularBusSectionWidgetAppModel.FAQSection.l;
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 4, value.g);
        compositeEncoderBeginStructure.encodeIntElement(serialDescriptor, 5, value.h);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 6, (SerializationStrategy) lazyArr[6].getValue(), value.i);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 7, FAQSectionAppModel$$serializer.f3734a, value.j);
        compositeEncoderBeginStructure.encodeBooleanElement(serialDescriptor, 8, value.k);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final /* bridge */ KSerializer[] typeParametersSerializers() {
        return PluginHelperInterfacesKt.f18164a;
    }
}
