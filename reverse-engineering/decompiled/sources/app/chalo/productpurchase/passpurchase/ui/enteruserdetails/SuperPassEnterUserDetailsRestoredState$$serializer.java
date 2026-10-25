package app.chalo.productpurchase.passpurchase.ui.enteruserdetails;

import androidx.autofill.HintConstants;
import app.chalo.scenes.args.SuperPassBasicUserPurpose;
import app.chalo.userprofile.Gender;
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
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.PluginHelperInterfacesKt;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"app/chalo/productpurchase/passpurchase/ui/enteruserdetails/SuperPassEnterUserDetailsRestoredState.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lapp/chalo/productpurchase/passpurchase/ui/enteruserdetails/SuperPassEnterUserDetailsRestoredState;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Deprecated
public final /* synthetic */ class SuperPassEnterUserDetailsRestoredState$$serializer implements GeneratedSerializer<SuperPassEnterUserDetailsRestoredState> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final SuperPassEnterUserDetailsRestoredState$$serializer f8422a;
    private static final SerialDescriptor descriptor;

    static {
        SuperPassEnterUserDetailsRestoredState$$serializer superPassEnterUserDetailsRestoredState$$serializer = new SuperPassEnterUserDetailsRestoredState$$serializer();
        f8422a = superPassEnterUserDetailsRestoredState$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("app.chalo.productpurchase.passpurchase.ui.enteruserdetails.SuperPassEnterUserDetailsRestoredState", superPassEnterUserDetailsRestoredState$$serializer, 6);
        pluginGeneratedSerialDescriptor.j("fullName", true);
        pluginGeneratedSerialDescriptor.j(HintConstants.AUTOFILL_HINT_GENDER, true);
        pluginGeneratedSerialDescriptor.j("dobInMillis", true);
        pluginGeneratedSerialDescriptor.j("passStartTime", true);
        pluginGeneratedSerialDescriptor.j("areAllRequiredFieldsSet", true);
        pluginGeneratedSerialDescriptor.j("superPassBasicUserPurpose", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] childSerializers() {
        Lazy[] lazyArr = SuperPassEnterUserDetailsRestoredState.g;
        LongSerializer longSerializer = LongSerializer.f18151a;
        return new KSerializer[]{StringSerializer.f18170a, lazyArr[1].getValue(), BuiltinSerializersKt.c(longSerializer), BuiltinSerializersKt.c(longSerializer), BooleanSerializer.f18123a, lazyArr[5].getValue()};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        boolean z;
        int i;
        String str;
        Gender gender;
        Long l;
        Long l2;
        SuperPassBasicUserPurpose superPassBasicUserPurpose;
        Intrinsics.i(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = SuperPassEnterUserDetailsRestoredState.g;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            String strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
            Gender gender2 = (Gender) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 1, (DeserializationStrategy) lazyArr[1].getValue(), null);
            LongSerializer longSerializer = LongSerializer.f18151a;
            Long l3 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, longSerializer, null);
            Long l4 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, longSerializer, null);
            boolean zDecodeBooleanElement = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 4);
            superPassBasicUserPurpose = (SuperPassBasicUserPurpose) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 5, (DeserializationStrategy) lazyArr[5].getValue(), null);
            str = strDecodeStringElement;
            l2 = l4;
            z = zDecodeBooleanElement;
            l = l3;
            i = 63;
            gender = gender2;
        } else {
            boolean z2 = true;
            boolean zDecodeBooleanElement2 = false;
            String strDecodeStringElement2 = null;
            Gender gender3 = null;
            Long l5 = null;
            Long l6 = null;
            SuperPassBasicUserPurpose superPassBasicUserPurpose2 = null;
            int i2 = 0;
            while (z2) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z2 = false;
                        continue;
                    case 0:
                        strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
                        i2 |= 1;
                        continue;
                    case 1:
                        gender3 = (Gender) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 1, (DeserializationStrategy) lazyArr[1].getValue(), gender3);
                        i2 |= 2;
                        break;
                    case 2:
                        l5 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, LongSerializer.f18151a, l5);
                        i2 |= 4;
                        break;
                    case 3:
                        l6 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, LongSerializer.f18151a, l6);
                        i2 |= 8;
                        break;
                    case 4:
                        zDecodeBooleanElement2 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 4);
                        i2 |= 16;
                        break;
                    case 5:
                        superPassBasicUserPurpose2 = (SuperPassBasicUserPurpose) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 5, (DeserializationStrategy) lazyArr[5].getValue(), superPassBasicUserPurpose2);
                        i2 |= 32;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            z = zDecodeBooleanElement2;
            i = i2;
            str = strDecodeStringElement2;
            gender = gender3;
            l = l5;
            l2 = l6;
            superPassBasicUserPurpose = superPassBasicUserPurpose2;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new SuperPassEnterUserDetailsRestoredState(i, str, gender, l, l2, z, superPassBasicUserPurpose);
    }

    @Override // kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object obj) {
        SuperPassEnterUserDetailsRestoredState value = (SuperPassEnterUserDetailsRestoredState) obj;
        Intrinsics.i(value, "value");
        SuperPassBasicUserPurpose superPassBasicUserPurpose = value.f;
        boolean z = value.e;
        Long l = value.d;
        Long l2 = value.c;
        Gender gender = value.b;
        String str = value.f8421a;
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = SuperPassEnterUserDetailsRestoredState.g;
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.d(str, "")) {
            compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 0, str);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 1) || gender != Gender.MALE) {
            compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 1, (SerializationStrategy) lazyArr[1].getValue(), gender);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 2) || l2 != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 2, LongSerializer.f18151a, l2);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 3) || l != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 3, LongSerializer.f18151a, l);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 4) || z) {
            compositeEncoderBeginStructure.encodeBooleanElement(serialDescriptor, 4, z);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 5) || superPassBasicUserPurpose != SuperPassBasicUserPurpose.COMPLETE_DETAILS) {
            compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 5, (SerializationStrategy) lazyArr[5].getValue(), superPassBasicUserPurpose);
        }
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final /* bridge */ KSerializer[] typeParametersSerializers() {
        return PluginHelperInterfacesKt.f18164a;
    }
}
