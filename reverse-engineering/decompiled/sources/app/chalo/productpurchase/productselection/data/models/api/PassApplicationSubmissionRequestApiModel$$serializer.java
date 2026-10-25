package app.chalo.productpurchase.productselection.data.models.api;

import java.util.Map;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.Metadata;
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
import org.npci.upi.security.pinactivitycomponent.CLConstants;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"app/chalo/productpurchase/productselection/data/models/api/PassApplicationSubmissionRequestApiModel.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lapp/chalo/productpurchase/productselection/data/models/api/PassApplicationSubmissionRequestApiModel;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Deprecated
public final /* synthetic */ class PassApplicationSubmissionRequestApiModel$$serializer implements GeneratedSerializer<PassApplicationSubmissionRequestApiModel> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PassApplicationSubmissionRequestApiModel$$serializer f8588a;
    private static final SerialDescriptor descriptor;

    static {
        PassApplicationSubmissionRequestApiModel$$serializer passApplicationSubmissionRequestApiModel$$serializer = new PassApplicationSubmissionRequestApiModel$$serializer();
        f8588a = passApplicationSubmissionRequestApiModel$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("app.chalo.productpurchase.productselection.data.models.api.PassApplicationSubmissionRequestApiModel", passApplicationSubmissionRequestApiModel$$serializer, 7);
        pluginGeneratedSerialDescriptor.j("city", false);
        pluginGeneratedSerialDescriptor.j("appVer", false);
        pluginGeneratedSerialDescriptor.j(CLConstants.SALT_FIELD_DEVICE_ID, false);
        pluginGeneratedSerialDescriptor.j("userDetails", false);
        pluginGeneratedSerialDescriptor.j("passProps", false);
        pluginGeneratedSerialDescriptor.j("proofs", false);
        pluginGeneratedSerialDescriptor.j("isReApplication", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] childSerializers() {
        Lazy[] lazyArr = PassApplicationSubmissionRequestApiModel.h;
        StringSerializer stringSerializer = StringSerializer.f18170a;
        return new KSerializer[]{stringSerializer, IntSerializer.f18146a, stringSerializer, PassApplicationUserDetailsRequestApiModel$$serializer.f8592a, PassApplicationPropsRequestApiModel$$serializer.f8586a, lazyArr[5].getValue(), BuiltinSerializersKt.c(BooleanSerializer.f18123a)};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        int i;
        Boolean bool;
        Map map;
        int i2;
        String str;
        String str2;
        PassApplicationUserDetailsRequestApiModel passApplicationUserDetailsRequestApiModel;
        PassApplicationPropsRequestApiModel passApplicationPropsRequestApiModel;
        Intrinsics.i(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = PassApplicationSubmissionRequestApiModel.h;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            String strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
            int iDecodeIntElement = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 1);
            String strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
            PassApplicationUserDetailsRequestApiModel passApplicationUserDetailsRequestApiModel2 = (PassApplicationUserDetailsRequestApiModel) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 3, PassApplicationUserDetailsRequestApiModel$$serializer.f8592a, null);
            PassApplicationPropsRequestApiModel passApplicationPropsRequestApiModel2 = (PassApplicationPropsRequestApiModel) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 4, PassApplicationPropsRequestApiModel$$serializer.f8586a, null);
            map = (Map) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 5, (DeserializationStrategy) lazyArr[5].getValue(), null);
            str = strDecodeStringElement;
            bool = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, BooleanSerializer.f18123a, null);
            passApplicationUserDetailsRequestApiModel = passApplicationUserDetailsRequestApiModel2;
            passApplicationPropsRequestApiModel = passApplicationPropsRequestApiModel2;
            str2 = strDecodeStringElement2;
            i = 127;
            i2 = iDecodeIntElement;
        } else {
            boolean z = true;
            int i3 = 0;
            Boolean bool2 = null;
            String strDecodeStringElement3 = null;
            String strDecodeStringElement4 = null;
            PassApplicationUserDetailsRequestApiModel passApplicationUserDetailsRequestApiModel3 = null;
            PassApplicationPropsRequestApiModel passApplicationPropsRequestApiModel3 = null;
            int iDecodeIntElement2 = 0;
            Map map2 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z = false;
                        break;
                    case 0:
                        i3 |= 1;
                        strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
                        continue;
                    case 1:
                        i3 |= 2;
                        iDecodeIntElement2 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 1);
                        continue;
                    case 2:
                        strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
                        i3 |= 4;
                        continue;
                    case 3:
                        passApplicationUserDetailsRequestApiModel3 = (PassApplicationUserDetailsRequestApiModel) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 3, PassApplicationUserDetailsRequestApiModel$$serializer.f8592a, passApplicationUserDetailsRequestApiModel3);
                        i3 |= 8;
                        break;
                    case 4:
                        passApplicationPropsRequestApiModel3 = (PassApplicationPropsRequestApiModel) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 4, PassApplicationPropsRequestApiModel$$serializer.f8586a, passApplicationPropsRequestApiModel3);
                        i3 |= 16;
                        break;
                    case 5:
                        map2 = (Map) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 5, (DeserializationStrategy) lazyArr[5].getValue(), map2);
                        i3 |= 32;
                        break;
                    case 6:
                        bool2 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, BooleanSerializer.f18123a, bool2);
                        i3 |= 64;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            i = i3;
            bool = bool2;
            map = map2;
            i2 = iDecodeIntElement2;
            str = strDecodeStringElement3;
            str2 = strDecodeStringElement4;
            passApplicationUserDetailsRequestApiModel = passApplicationUserDetailsRequestApiModel3;
            passApplicationPropsRequestApiModel = passApplicationPropsRequestApiModel3;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new PassApplicationSubmissionRequestApiModel(i, str, i2, str2, passApplicationUserDetailsRequestApiModel, passApplicationPropsRequestApiModel, map, bool);
    }

    @Override // kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object obj) {
        PassApplicationSubmissionRequestApiModel value = (PassApplicationSubmissionRequestApiModel) obj;
        Intrinsics.i(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = PassApplicationSubmissionRequestApiModel.h;
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 0, value.f8587a);
        compositeEncoderBeginStructure.encodeIntElement(serialDescriptor, 1, value.b);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 2, value.c);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 3, PassApplicationUserDetailsRequestApiModel$$serializer.f8592a, value.d);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 4, PassApplicationPropsRequestApiModel$$serializer.f8586a, value.e);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 5, (SerializationStrategy) lazyArr[5].getValue(), value.f);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 6, BooleanSerializer.f18123a, value.g);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final /* bridge */ KSerializer[] typeParametersSerializers() {
        return PluginHelperInterfacesKt.f18164a;
    }
}
