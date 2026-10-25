package app.chalo.sos.official;

import java.util.List;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializationStrategy;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
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
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"app/chalo/sos/official/SosOfficialContactEntryApiModel.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lapp/chalo/sos/official/SosOfficialContactEntryApiModel;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Deprecated
public final /* synthetic */ class SosOfficialContactEntryApiModel$$serializer implements GeneratedSerializer<SosOfficialContactEntryApiModel> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final SosOfficialContactEntryApiModel$$serializer f9455a;
    private static final SerialDescriptor descriptor;

    static {
        SosOfficialContactEntryApiModel$$serializer sosOfficialContactEntryApiModel$$serializer = new SosOfficialContactEntryApiModel$$serializer();
        f9455a = sosOfficialContactEntryApiModel$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("app.chalo.sos.official.SosOfficialContactEntryApiModel", sosOfficialContactEntryApiModel$$serializer, 7);
        pluginGeneratedSerialDescriptor.j("id", true);
        pluginGeneratedSerialDescriptor.j("enabled", true);
        pluginGeneratedSerialDescriptor.j("minAppVer", true);
        pluginGeneratedSerialDescriptor.j("maxAppVer", true);
        pluginGeneratedSerialDescriptor.j("priority", true);
        pluginGeneratedSerialDescriptor.j("eligibility", true);
        pluginGeneratedSerialDescriptor.j("numbers", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] childSerializers() {
        Lazy[] lazyArr = SosOfficialContactEntryApiModel.h;
        IntSerializer intSerializer = IntSerializer.f18146a;
        return new KSerializer[]{BuiltinSerializersKt.c(StringSerializer.f18170a), BooleanSerializer.f18123a, intSerializer, intSerializer, intSerializer, BuiltinSerializersKt.c(SosOfficialContactEligibilityApiModel$$serializer.f9453a), lazyArr[6].getValue()};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        int i;
        List list;
        SosOfficialContactEligibilityApiModel sosOfficialContactEligibilityApiModel;
        int i2;
        int i3;
        int i4;
        boolean z;
        String str;
        Intrinsics.i(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = SosOfficialContactEntryApiModel.h;
        int i5 = 5;
        int i6 = 3;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            String str2 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.f18170a, null);
            boolean zDecodeBooleanElement = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 1);
            int iDecodeIntElement = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 2);
            int iDecodeIntElement2 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 3);
            int iDecodeIntElement3 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 4);
            SosOfficialContactEligibilityApiModel sosOfficialContactEligibilityApiModel2 = (SosOfficialContactEligibilityApiModel) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, SosOfficialContactEligibilityApiModel$$serializer.f9453a, null);
            list = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 6, (DeserializationStrategy) lazyArr[6].getValue(), null);
            str = str2;
            sosOfficialContactEligibilityApiModel = sosOfficialContactEligibilityApiModel2;
            i = iDecodeIntElement2;
            i2 = iDecodeIntElement3;
            i3 = iDecodeIntElement;
            i4 = 127;
            z = zDecodeBooleanElement;
        } else {
            boolean z2 = true;
            int iDecodeIntElement4 = 0;
            int iDecodeIntElement5 = 0;
            int i7 = 0;
            boolean zDecodeBooleanElement2 = false;
            List list2 = null;
            String str3 = null;
            int iDecodeIntElement6 = 0;
            SosOfficialContactEligibilityApiModel sosOfficialContactEligibilityApiModel3 = null;
            while (z2) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z2 = false;
                        i6 = 3;
                        break;
                    case 0:
                        str3 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.f18170a, str3);
                        i7 |= 1;
                        i5 = 5;
                        i6 = 3;
                        break;
                    case 1:
                        i7 |= 2;
                        zDecodeBooleanElement2 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 1);
                        break;
                    case 2:
                        iDecodeIntElement5 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 2);
                        i7 |= 4;
                        break;
                    case 3:
                        iDecodeIntElement4 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, i6);
                        i7 |= 8;
                        break;
                    case 4:
                        iDecodeIntElement6 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 4);
                        i7 |= 16;
                        break;
                    case 5:
                        sosOfficialContactEligibilityApiModel3 = (SosOfficialContactEligibilityApiModel) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i5, SosOfficialContactEligibilityApiModel$$serializer.f9453a, sosOfficialContactEligibilityApiModel3);
                        i7 |= 32;
                        break;
                    case 6:
                        list2 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 6, (DeserializationStrategy) lazyArr[6].getValue(), list2);
                        i7 |= 64;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            i = iDecodeIntElement4;
            list = list2;
            sosOfficialContactEligibilityApiModel = sosOfficialContactEligibilityApiModel3;
            i2 = iDecodeIntElement6;
            i3 = iDecodeIntElement5;
            i4 = i7;
            z = zDecodeBooleanElement2;
            str = str3;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new SosOfficialContactEntryApiModel(i4, str, z, i3, i, i2, sosOfficialContactEligibilityApiModel, list);
    }

    @Override // kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object obj) {
        SosOfficialContactEntryApiModel value = (SosOfficialContactEntryApiModel) obj;
        Intrinsics.i(value, "value");
        List list = value.g;
        SosOfficialContactEligibilityApiModel sosOfficialContactEligibilityApiModel = value.f;
        int i = value.e;
        int i2 = value.d;
        int i3 = value.c;
        boolean z = value.b;
        String str = value.f9454a;
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = SosOfficialContactEntryApiModel.h;
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 0) || str != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.f18170a, str);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 1) || z) {
            compositeEncoderBeginStructure.encodeBooleanElement(serialDescriptor, 1, z);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 2) || i3 != 0) {
            compositeEncoderBeginStructure.encodeIntElement(serialDescriptor, 2, i3);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 3) || i2 != Integer.MAX_VALUE) {
            compositeEncoderBeginStructure.encodeIntElement(serialDescriptor, 3, i2);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 4) || i != Integer.MAX_VALUE) {
            compositeEncoderBeginStructure.encodeIntElement(serialDescriptor, 4, i);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 5) || sosOfficialContactEligibilityApiModel != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 5, SosOfficialContactEligibilityApiModel$$serializer.f9453a, sosOfficialContactEligibilityApiModel);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.d(list, EmptyList.f17557a)) {
            compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 6, (SerializationStrategy) lazyArr[6].getValue(), list);
        }
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final /* bridge */ KSerializer[] typeParametersSerializers() {
        return PluginHelperInterfacesKt.f18164a;
    }
}
