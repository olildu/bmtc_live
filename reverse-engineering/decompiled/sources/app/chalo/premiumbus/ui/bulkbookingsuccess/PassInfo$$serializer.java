package app.chalo.premiumbus.ui.bulkbookingsuccess;

import app.chalo.models.SuperPassSubTypes;
import app.chalo.premiumbus.data.SuperPassStatusAppModel;
import app.chalo.premiumbus.data.SuperPassTripPreferencesAppModel;
import app.chalo.premiumbus.data.SuperPassTripPreferencesAppModel$$serializer;
import java.util.List;
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
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.PluginHelperInterfacesKt;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"app/chalo/premiumbus/ui/bulkbookingsuccess/PassInfo.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lapp/chalo/premiumbus/ui/bulkbookingsuccess/PassInfo;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Deprecated
public final /* synthetic */ class PassInfo$$serializer implements GeneratedSerializer<PassInfo> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PassInfo$$serializer f7492a;
    private static final SerialDescriptor descriptor;

    static {
        PassInfo$$serializer passInfo$$serializer = new PassInfo$$serializer();
        f7492a = passInfo$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("app.chalo.premiumbus.ui.bulkbookingsuccess.PassInfo", passInfo$$serializer, 11);
        pluginGeneratedSerialDescriptor.j("passName", false);
        pluginGeneratedSerialDescriptor.j("configId", false);
        pluginGeneratedSerialDescriptor.j("passValidity", false);
        pluginGeneratedSerialDescriptor.j("passStatus", false);
        pluginGeneratedSerialDescriptor.j("remainingTrips", false);
        pluginGeneratedSerialDescriptor.j("totalTrips", false);
        pluginGeneratedSerialDescriptor.j("tripPreference", false);
        pluginGeneratedSerialDescriptor.j("specialFeatures", false);
        pluginGeneratedSerialDescriptor.j("termsAndConditions", false);
        pluginGeneratedSerialDescriptor.j("productSubType", false);
        pluginGeneratedSerialDescriptor.j("fareMappingId", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] childSerializers() {
        Lazy[] lazyArr = PassInfo.l;
        StringSerializer stringSerializer = StringSerializer.f18170a;
        IntSerializer intSerializer = IntSerializer.f18146a;
        return new KSerializer[]{stringSerializer, stringSerializer, LongSerializer.f18151a, lazyArr[3].getValue(), intSerializer, intSerializer, SuperPassTripPreferencesAppModel$$serializer.f6972a, lazyArr[7].getValue(), lazyArr[8].getValue(), lazyArr[9].getValue(), intSerializer};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        int iDecodeIntElement;
        SuperPassSubTypes superPassSubTypes;
        List list;
        SuperPassTripPreferencesAppModel superPassTripPreferencesAppModel;
        List list2;
        SuperPassStatusAppModel superPassStatusAppModel;
        int i;
        int i2;
        int i3;
        String str;
        String str2;
        long j;
        char c;
        Intrinsics.i(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = PassInfo.l;
        int i4 = 10;
        int i5 = 0;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            String strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
            String strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
            long jDecodeLongElement = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 2);
            SuperPassStatusAppModel superPassStatusAppModel2 = (SuperPassStatusAppModel) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 3, (DeserializationStrategy) lazyArr[3].getValue(), null);
            int iDecodeIntElement2 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 4);
            int iDecodeIntElement3 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 5);
            SuperPassTripPreferencesAppModel superPassTripPreferencesAppModel2 = (SuperPassTripPreferencesAppModel) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 6, SuperPassTripPreferencesAppModel$$serializer.f6972a, null);
            List list3 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 7, (DeserializationStrategy) lazyArr[7].getValue(), null);
            List list4 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 8, (DeserializationStrategy) lazyArr[8].getValue(), null);
            superPassSubTypes = (SuperPassSubTypes) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 9, (DeserializationStrategy) lazyArr[9].getValue(), null);
            str = strDecodeStringElement;
            iDecodeIntElement = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 10);
            superPassTripPreferencesAppModel = superPassTripPreferencesAppModel2;
            i2 = iDecodeIntElement3;
            i3 = iDecodeIntElement2;
            superPassStatusAppModel = superPassStatusAppModel2;
            i = 2047;
            list2 = list3;
            list = list4;
            str2 = strDecodeStringElement2;
            j = jDecodeLongElement;
        } else {
            boolean z = true;
            int iDecodeIntElement4 = 0;
            SuperPassSubTypes superPassSubTypes2 = null;
            List list5 = null;
            SuperPassTripPreferencesAppModel superPassTripPreferencesAppModel3 = null;
            List list6 = null;
            SuperPassStatusAppModel superPassStatusAppModel3 = null;
            String strDecodeStringElement3 = null;
            long jDecodeLongElement2 = 0;
            int iDecodeIntElement5 = 0;
            int iDecodeIntElement6 = 0;
            String strDecodeStringElement4 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z = false;
                        i4 = 10;
                        break;
                    case 0:
                        strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
                        i5 |= 1;
                        i4 = 10;
                        break;
                    case 1:
                        strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
                        i5 |= 2;
                        i4 = 10;
                        break;
                    case 2:
                        jDecodeLongElement2 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 2);
                        i5 |= 4;
                        i4 = 10;
                        break;
                    case 3:
                        superPassStatusAppModel3 = (SuperPassStatusAppModel) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 3, (DeserializationStrategy) lazyArr[3].getValue(), superPassStatusAppModel3);
                        i5 |= 8;
                        i4 = 10;
                        break;
                    case 4:
                        iDecodeIntElement6 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 4);
                        i5 |= 16;
                        i4 = 10;
                        break;
                    case 5:
                        c = 6;
                        iDecodeIntElement5 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 5);
                        i5 |= 32;
                        i4 = 10;
                        break;
                    case 6:
                        c = 6;
                        superPassTripPreferencesAppModel3 = (SuperPassTripPreferencesAppModel) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 6, SuperPassTripPreferencesAppModel$$serializer.f6972a, superPassTripPreferencesAppModel3);
                        i5 |= 64;
                        i4 = 10;
                        break;
                    case 7:
                        list6 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 7, (DeserializationStrategy) lazyArr[7].getValue(), list6);
                        i5 |= 128;
                        break;
                    case 8:
                        list5 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 8, (DeserializationStrategy) lazyArr[8].getValue(), list5);
                        i5 |= 256;
                        break;
                    case 9:
                        superPassSubTypes2 = (SuperPassSubTypes) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 9, (DeserializationStrategy) lazyArr[9].getValue(), superPassSubTypes2);
                        i5 |= 512;
                        break;
                    case 10:
                        iDecodeIntElement4 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, i4);
                        i5 |= 1024;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            iDecodeIntElement = iDecodeIntElement4;
            superPassSubTypes = superPassSubTypes2;
            list = list5;
            superPassTripPreferencesAppModel = superPassTripPreferencesAppModel3;
            list2 = list6;
            superPassStatusAppModel = superPassStatusAppModel3;
            i = i5;
            i2 = iDecodeIntElement5;
            i3 = iDecodeIntElement6;
            str = strDecodeStringElement4;
            str2 = strDecodeStringElement3;
            j = jDecodeLongElement2;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new PassInfo(i, str, str2, j, superPassStatusAppModel, i3, i2, superPassTripPreferencesAppModel, list2, list, superPassSubTypes, iDecodeIntElement);
    }

    @Override // kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object obj) {
        PassInfo value = (PassInfo) obj;
        Intrinsics.i(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = PassInfo.l;
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 0, value.f7491a);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 1, value.b);
        compositeEncoderBeginStructure.encodeLongElement(serialDescriptor, 2, value.c);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 3, (SerializationStrategy) lazyArr[3].getValue(), value.d);
        compositeEncoderBeginStructure.encodeIntElement(serialDescriptor, 4, value.e);
        compositeEncoderBeginStructure.encodeIntElement(serialDescriptor, 5, value.f);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 6, SuperPassTripPreferencesAppModel$$serializer.f6972a, value.g);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 7, (SerializationStrategy) lazyArr[7].getValue(), value.h);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 8, (SerializationStrategy) lazyArr[8].getValue(), value.i);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 9, (SerializationStrategy) lazyArr[9].getValue(), value.j);
        compositeEncoderBeginStructure.encodeIntElement(serialDescriptor, 10, value.k);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final /* bridge */ KSerializer[] typeParametersSerializers() {
        return PluginHelperInterfacesKt.f18164a;
    }
}
